package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.WebOrderHomePage;
import pages.WebOrdersLogin;
import pages.WebOrdersOrdersPage;
import utilities.Configuration;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class WebOrdersStepDefs {

    WebDriver driver= Driver.getDriver();
    WebOrdersLogin wol=new WebOrdersLogin();
    WebOrderHomePage wohp=new WebOrderHomePage();
    WebOrdersOrdersPage woop=new WebOrdersOrdersPage();



    @Given("^User is loged in to WebOrders with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_is_loged_in_to_WebOrders_with_username_and_password(String userName, String password) throws Throwable {

        driver.get(Configuration.getProperty("WebOrderUrl"));
        wol.userName.sendKeys(userName);
        Thread.sleep(2000);
        wol.password.sendKeys(password);
        Thread.sleep(2000);
        wol.loginButton.click();
        Thread.sleep(2000);

    }

    @Given("^User verifies that he is on WebOrder home page$")
    public void user_verifies_that_he_is_on_WebOrder_home_page() throws Throwable {

        String actual=driver.getTitle();
        String expected="Web Orders";

        Assert.assertEquals("Actual Title didn't match with expected: " +
                ""+"\nActual: "+actual+" \nExpected: "+expected,expected,actual);


    }

    @Then("^User goes to Orders page$")
    public void user_goes_to_Orders_page() throws Throwable {
        wohp.orderButton.click();
        Thread.sleep(2000);

    }

    @Then("^User creates orders$")
    public void user_creates_orders(DataTable dataTable) throws Throwable {

        List<Map<String, Object>> listOfMaps=dataTable.asMaps(String.class,Object.class);
        System.out.println("Size of listOfMaps is: "+listOfMaps.size());
        System.out.println("Size of Map: "+ listOfMaps.get(0).size());

        for(int i=0; i<listOfMaps.size(); i++){

            woop.quantity.clear();
            woop.quantity.sendKeys(listOfMaps.get(i).get("Quantity").toString());
            Thread.sleep(1000);
            woop.customerName.sendKeys((listOfMaps.get(i).get("Customer name")).toString());
            Thread.sleep(1000);
            woop.street.sendKeys(listOfMaps.get(i).get("Street").toString());
            Thread.sleep(1000);
            woop.city.sendKeys(listOfMaps.get(i).get("City").toString());
            Thread.sleep(1000);
            //woop.state.sendKeys(listOfMaps.get(i).get("State").toString());
            woop.zip.sendKeys(listOfMaps.get(i).get("Zip").toString());
            Thread.sleep(1000);
            woop.cardNr.sendKeys(listOfMaps.get(i).get("Card Nr").toString());
            Thread.sleep(1000);
            woop.expireDate.sendKeys(listOfMaps.get(i).get("Expire date").toString());
            Thread.sleep(1000);
            woop.card.click();
            Thread.sleep(1000);
            woop.processButton.click();
            Thread.sleep(3000);
        }


    }

    @Then("^User goes to View All Orders page$")
    public void user_goes_to_View_All_Orders_page() throws Throwable {

    }

    @Then("^User verifies that orders are created$")
    public void user_verifies_that_orders_are_created() throws Throwable {

    }









}

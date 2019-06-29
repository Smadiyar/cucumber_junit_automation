package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;
import pages.EtsyHomeWorkSearchItem;
import utilities.BrowserUtilities;
import utilities.Configuration;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class EtsyHomeWorkStepDef {

    WebDriver driver= Driver.getDriver();
    EtsyHomeWorkSearchItem item=new EtsyHomeWorkSearchItem();



    @Given("^User entering etsy\\.com page$")
    public void user_entering_etsy_com_page() throws Throwable {
        driver.get(Configuration.getProperty("etsyUrl"));

    }

    @Given("^User searching for item$")
    public void user_searching_for_item(DataTable table) throws Throwable {

//       List<Map<String, String>> map=table.asMaps(String.class,String.class);
//
//        for(int i=0; i<map.size(); i++){
//
//            System.out.println(map);
//        }


        item.searchBox.sendKeys("Wooden spoon");
        item.searchButton.click();
        Thread.sleep(2000);
        item.woodenSpoon.click();
        Thread.sleep(2000);
        BrowserUtilities.switchToWindow("Wood spoon handmade wooden spoon made from cherry wood | Etsy");



    }

    @Then("^User saves item in the cart$")
    public void user_saves_item_in_the_cart() throws Throwable {

        Select sel =new Select(item.select);
        sel.selectByIndex(1);
        //sel.selectByVisibleText("one spoon");
        Thread.sleep(2000);
        item.cartButton.click();
        Thread.sleep(2000);

        item.searchBox.clear();
        item.searchBox.sendKeys("");


    }

    @Then("^User verifyies price$")
    public void user_verifyies_price() throws Throwable {

    }
}

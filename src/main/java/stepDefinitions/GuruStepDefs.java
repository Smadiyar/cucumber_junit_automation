package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import pages.GuruPage;
import utilities.Configuration;
import utilities.Driver;

public class GuruStepDefs {

    WebDriver driver= Driver.getDriver();
    GuruPage guruPage=new GuruPage();


    @Given("^User entering to Guru web site$")
    public void user_entering_to_Guru_web_site() throws InterruptedException {
        driver.get(Configuration.getProperty("guruUrl"));


    }

    @Then("^User enterning ID \"([^\"]*)\"$")
    public void user_enterning_ID(String ID) throws InterruptedException {

        guruPage.id.sendKeys(ID);
        Thread.sleep(2000);

    }

    @When("^User clicking on Submit button$")
    public void user_clicking_on_Submit_button() throws InterruptedException {
        guruPage.submit.click();
        Thread.sleep(2000);

    }

    @Then("^User clikcking on pop up allert$")
    public void user_clikcking_on_pop_up_allert() throws InterruptedException {
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        alert.dismiss();


       // @Then ("^User should sign in with valid login and password")



    }


}

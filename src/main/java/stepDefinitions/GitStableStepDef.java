package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.gitStableLoginPage;
import utilities.Configuration;
import utilities.Driver;

public class GitStableStepDef {

WebDriver driver= Driver.getDriver();
 gitStableLoginPage gslp= new gitStableLoginPage();


    @Given("^User is on GitStable website  loginpage$")
    public void user_is_on_GitStable_website_loginpage() throws Throwable {
        driver.get(Configuration.getProperty("gitStableUrl"));

    }

    @Then("^User logs in with valid credentials login \"([^\"]*)\" password \"([^\"]*)\"$")
    public void user_logs_in_with_valid_credentials_login_password(String login, String password) throws Throwable {

         gslp.userName.clear();
         gslp.userName.sendKeys(login);
         gslp.password.clear();
         gslp.password.sendKeys(password);
         gslp.button.click();


    }

    @Then("^User verifies logged in to homepage$")
    public void user_verifies_logged_in_to_homepage() throws Throwable {
       String actual= driver.getTitle();
        Assert.assertEquals("My home page", actual);

        driver.quit();

    }

    @Then("^User verifies error message \"([^\"]*)\" message$")
    public void user_verifies_error_message_message(String errorMessage) throws Throwable {
        String actual=gslp.errorMessage.getText();
        Assert.assertEquals(errorMessage, actual);



    }


}

package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.InstagramHomePage;
import pages.InstagramLoginPage;
import utilities.Configuration;
import utilities.Driver;

public class InstagramStepDef {

WebDriver driver= Driver.getDriver();;
    InstagramLoginPage ip=new InstagramLoginPage();


    @Given("^User is on Instagram login page$")
    public void user_is_on_Instagram_login_page() throws Throwable {
        driver.get(Configuration.getProperty("instagramUrl"));

    }

    @Then("^User logs in with valid credentials username \"([^\"]*)\" userpassword \"([^\"]*)\"$")
    public void user_logs_in_with_valid_credentials_username_userpassword(String userName, String password) throws Throwable {
        ip.userName.sendKeys(userName);
        ip.password.sendKeys(password);
        ip.LoginButton.click();
    }

//    @Then("^User logs in with valid credentials userName \"([^\"]*)\" userPassword \"([^\"]*)\"$")
//    public void user_logs_in_with_valid_credentials_userName_userPassword(String username, String password) throws Throwable {
//
//        ip.userName.sendKeys(username);
//        ip.password.sendKeys(password);
//        ip.LoginButton.click();
//    }

    @Then("^User verifies logged in to homepage of Instagram$")
    public void user_verifies_logged_in_to_homepage_of_Instagram() throws Throwable {

    }


}

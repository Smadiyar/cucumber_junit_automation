package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.UploadPage;
import utilities.Configuration;
import utilities.Driver;

public class UploadStepDefs {

    WebDriver driver = Driver.getDriver();
    UploadPage uploadPage=new UploadPage();






    @Given("^User on Guru WebSite$")
    public void user_on_Guru_WebSite() throws Throwable {
        driver.get("http://demo.guru99.com/test/upload/");
//        uploadPage.chooseFile.click();
//        Thread.sleep(2000);




    }

    @When("^User uploads \"([^\"]*)\"$")
    public void user_uploads(String picture) throws Throwable {
        uploadPage.chooseFile.sendKeys(picture);
        Thread.sleep(2000);

    }
}

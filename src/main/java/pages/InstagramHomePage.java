package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstagramHomePage {

    WebDriver driver;

    public InstagramHomePage(){

        this.driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


}

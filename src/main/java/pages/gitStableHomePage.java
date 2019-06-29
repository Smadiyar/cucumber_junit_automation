package pages;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class gitStableHomePage {

    WebDriver driver;

    public gitStableHomePage(){

        this.driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }





}

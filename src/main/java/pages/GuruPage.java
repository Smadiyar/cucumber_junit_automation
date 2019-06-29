package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuruPage {


    WebDriver driver;


    public GuruPage(){

        this.driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "//input[@type='text']")
    public WebElement id;

    @FindBy(xpath = "//input[@type='submit']")

    public WebElement submit;


}

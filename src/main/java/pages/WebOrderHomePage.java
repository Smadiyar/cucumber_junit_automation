package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebOrderHomePage {

    WebDriver driver;

    public WebOrderHomePage(){

        this.driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement orderButton;







}

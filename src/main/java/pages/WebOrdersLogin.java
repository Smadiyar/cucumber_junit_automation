package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebOrdersLogin {

WebDriver driver;

public WebOrdersLogin(){

    this.driver= Driver.getDriver();
    PageFactory.initElements(driver,this);

}

    @FindBy(xpath = "//input[@name='ctl00$MainContent$username']")
    public WebElement userName;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$password']")
    public WebElement password;


    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;










}

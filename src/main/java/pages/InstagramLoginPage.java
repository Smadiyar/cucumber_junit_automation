package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstagramLoginPage {


    WebDriver driver;

    public InstagramLoginPage() {

        this.driver= Driver.getDriver();
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//input[@id='f2447761153b768']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='f3c43e210a05e1']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='_0mzm- sqdOP  L3NKy       ']")
    public WebElement LoginButton;



}

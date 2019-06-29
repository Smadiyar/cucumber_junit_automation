package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebOrdersOrdersPage {

    WebDriver driver;

    public WebOrdersOrdersPage() {

        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    public WebElement customerName;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
    public WebElement street;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    public WebElement city;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")
    public WebElement zip;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")
    public WebElement cardNr;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
    public WebElement expireDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement card;


    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;


}

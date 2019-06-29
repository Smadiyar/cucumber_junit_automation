package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyHomeWorkSearchItem {

    WebDriver driver= Driver.getDriver();


    public EtsyHomeWorkSearchItem(){

        this.driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//input[@id='search-query']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement searchButton;

    @FindBy(xpath = "(//img[@src='https://i.etsystatic.com/14874696/c/1836/1458/1072/0/il/b469ce/1736837188/il_340x270.1736837188_4vlb.jpg'])[1]")
    public WebElement woodenSpoon;

    @FindBy(xpath = "//select[@id='inventory-variation-select-0']")
    public WebElement select;

    @FindBy(xpath = "//button[@class='btn btn-primary width-full btn-buy-box  mt-md-0 mt-xs-2']")
    public WebElement cartButton;
}

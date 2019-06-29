package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class resultPage {

    WebDriver driver;

    public resultPage(){

        this.driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }

@FindBy(xpath = "//h1[@class='display-inline text-smaller']")
    public WebElement searchMessage;


    @FindBy(xpath="//span[.='Under $25']")
    public WebElement under25PriceRange;

@FindBy(xpath = "//span[@class='currency-value']")
    public List<WebElement> priceList;

@FindBy(xpath = "//span[@aria-hidden='true']//span[@class='currency-value']")
    public List<WebElement> originalPrices;



public List<WebElement> removeOriginal(List<WebElement> priceList, List<WebElement> originalPrices){

     priceList.removeAll(originalPrices);

     return priceList;
}






}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class etsyHomePage {


    WebDriver driver;

    public etsyHomePage(){

        this.driver= Driver.getDriver();
        PageFactory.initElements(driver,this);


    }

    @FindBy(id="search-query")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement getSearchButton;

    public void searchForIem(String item){

        searchBox.sendKeys(item);
        getSearchButton.click();

    }

    @FindBy(id="catnav-primary-link-10855")
    public WebElement jewelry;


    @FindBy(id="catnav-primary-link-10923")
    public WebElement clothing;

    @FindBy(id="catnav-primary-link-891")
    public WebElement home;

    @FindBy(id="catnav-primary-link-10983")
    public WebElement wedding;

    @FindBy(id="catnav-primary-link-11049")
    public WebElement toys;


    



}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UploadPage {


    WebDriver driver;

    public UploadPage (){

        this.driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "/html//input[@id='uploadfile_0']")
    public WebElement chooseFile;






}

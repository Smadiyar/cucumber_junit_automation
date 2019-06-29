package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MyAppPages {

    WebDriver driver;

    public MyAppPages(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//tr[1]//td")
    public List<WebElement> firstRow;

    @FindBy(xpath = "//tr[2]//td")
    public List<WebElement> seconRow;

    @FindBy(xpath = "//tr[3]//td")
    public List<WebElement> thirdRow;

    @FindBy(xpath = "//tr[4]//td")
    public List<WebElement> fourthRow;
}

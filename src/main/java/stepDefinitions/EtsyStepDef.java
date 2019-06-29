package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.etsyHomePage;
import pages.resultPage;
import utilities.Configuration;
import utilities.Driver;

public class EtsyStepDef {

    WebDriver driver= Driver.getDriver();
    etsyHomePage eh = new etsyHomePage();
    resultPage rp = new resultPage();

    @Given("^User is on etsy homepage$")
    public void user_is_on_etsy_homepage() throws Throwable {

        driver.get(Configuration.getProperty("etsyUrl"));

    }

    @Then("^User searches for \"([^\"]*)\"$")
    public void user_searches_for(String item) throws Throwable {

   eh.searchForIem(item);

    }

//    @Then("^User verifies the result has only for searched item$")
//    public void user_verifies_the_result_has_only_for_searched_item() throws Throwable {
//
//        String actualMessage=rp.searchMessage.getText();
//        Assert.assertEquals("phone wireless charger", actualMessage);
//
//
//    }



    @Then("^User verifies the result has only for searched \"([^\"]*)\"$")
    public void user_verifies_the_result_has_only_for_searched(String item) throws Throwable {
        String actualMessage=rp.searchMessage.getText();
        Assert.assertEquals(item, actualMessage);

    }

    @Then("^User choose under (\\d+) price range$")
    public void user_choose_under_price_range(int arg1) throws Throwable {
        rp.under25PriceRange.click();



    }

    @Then("^User verifies the all result prices are under (\\d+)$")
    public void user_verifies_the_all_result_prices_are_under(int priceRange) throws Throwable {
        rp.removeOriginal(rp.priceList,rp.originalPrices);
        System.out.println("Number of origin prices: "+rp.priceList.size());
      for(WebElement price:rp.priceList){
          Assert.assertTrue(Double.parseDouble(price.getText())<=priceRange);

      }

    }


        @When("^User click on \"([^\"]*)\"$")
        public void user_click_on(String section) throws Throwable {
        if(section.equalsIgnoreCase(eh.jewelry.getText())){
            eh.jewelry.click();
        } else if(section.equalsIgnoreCase(eh.clothing.getText())){
            eh.clothing.click();
        }else if(section.equalsIgnoreCase(eh.home.getText())){
            eh.home.click();
        }else if(section.equalsIgnoreCase(eh.wedding.getText())){
            eh.wedding.click();
        }else if(section.equalsIgnoreCase(eh.toys.getText())){
            eh.toys.click();
        }else{
            Assert.assertTrue(false);
        }

        }

        @Then("^User verifies that \"([^\"]*)\"$")
        public void user_verifies_that(String title) throws Throwable {

        String actualTitle=driver.getTitle();
        Assert.assertEquals(title, actualTitle);


        }

}

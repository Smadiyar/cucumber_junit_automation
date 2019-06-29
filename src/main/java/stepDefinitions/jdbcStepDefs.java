package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MyAppPages;
import utilities.Configuration;
import utilities.Driver;
import utilities.jdbcUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jdbcStepDefs {

    WebDriver driver=Driver.getDriver();

    List<Map<String,Object>> listOfUIDatas;


    @Given("^User goes to MyApplication homepage$")
    public void user_goes_to_MyApplication_homepage() throws Throwable {
        driver.get(Configuration.getProperty("MyAppUrl"));
        Thread.sleep(5000);

    }

    @Then("^User gets data from UI table$")
    public void user_gets_data_from_UI_table() throws Throwable {
        listOfUIDatas=new ArrayList<>();
        MyAppPages myAppPages=new MyAppPages();

        Map<String,Object> rowMap=new HashMap<>();

            rowMap.put("name",myAppPages.firstRow.get(0).getText());
            rowMap.put("lastName",myAppPages.firstRow.get(1).getText());
            rowMap.put("employeeID",myAppPages.firstRow.get(2).getText());
            rowMap.put("jobTitle",myAppPages.firstRow.get(3).getText());

            listOfUIDatas.add(rowMap);


        Map<String,Object> rowMap1=new HashMap<>();

        rowMap.put("name",myAppPages.seconRow.get(0).getText());
        rowMap.put("lastName",myAppPages.seconRow.get(1).getText());
        rowMap.put("employeeID",myAppPages.seconRow.get(2).getText());
        rowMap.put("jobTitle",myAppPages.seconRow.get(3).getText());

        listOfUIDatas.add(rowMap1);


    }

    @Then("^Verify that data is matched with DB$")
    public void verify_that_data_is_matched_with_DB() throws Throwable {

        jdbcUtils.establishConnection();

       List<Map<String, Object>> dbListOfMaps=jdbcUtils.runSQLQuery("select e.first_name, e.last_name, e.employee_id, j.job_title from employees e join jobs j using(job_id)\n" +
                "where e.first_name='" +listOfUIDatas.get(0).get("name")+"' "+" and e.last_name='"+listOfUIDatas.get(0).get("lastName") +"'");


        System.out.println("Size of db listofmaps: "+dbListOfMaps.size());
        System.out.println(listOfUIDatas.get(0).get("jobTitle"));

        Assert.assertEquals(dbListOfMaps.get(0).get("FIRST_NAME").toString(),listOfUIDatas.get(0).get("name"));
        Assert.assertEquals(dbListOfMaps.get(0).get("LAST_NAME").toString(),listOfUIDatas.get(0).get("lastName"));
        Assert.assertEquals(dbListOfMaps.get(0).get("EMPLOYEE_ID").toString(),listOfUIDatas.get(0).get("employeeID"));
        Assert.assertEquals(dbListOfMaps.get(0).get("JOB_TITLE").toString(),listOfUIDatas.get(0).get("jobTitle"));


        jdbcUtils.closeConnections();
    }
}

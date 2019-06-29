package Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(

        plugin = {"html:target/cucumberHTML-report",
                "json:target/cucumber.json"},
                features = "src/main/resources/TestFeatures/Guru.feature",
                glue = "stepDefinitions",
                dryRun = false





                )

public class GuruRunner {



}

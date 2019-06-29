package Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/cucumberHTML-report",
                    "json:target/cucumber.json"},
            features = "src/main/resources/TestFeatures",
            glue = "stepDefinitions",
            tags = "@EtsyHomeWork",
            dryRun = false


    )

    public class EtsyHomeWork {



}

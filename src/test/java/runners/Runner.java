package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/OrangeFeatures",
        glue = "steps",
        tags = "@HRMSLogin",
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-html-reports/index.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
        //monochrome = true,
        //dryRun = true

)
public class Runner {

}

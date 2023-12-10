package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources",
        glue = "steps",
        tags = "@scenariooutline",
        plugin = {"pretty","html:target/cucumber-report/index.html"},
        monochrome = true,
        dryRun = true

)
public class Runner {

}

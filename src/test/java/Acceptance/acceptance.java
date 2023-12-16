package Acceptance;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/OrangeFeatures",
        glue = "StepDefs",
        tags = "@OrangeHRMSLogin"
)
public class acceptance {}

package Acceptance;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/OrangeFeatures",
        glue = "StepDefs",
        tags = "@OrangeHRMSLogin",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class acceptance {}

package steps;

import Utility.ReadJsonFile;
import Utility.ReadingPropertiesFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {
    protected WebDriver driver;
    @Before
    public void setup() throws IOException, ParseException {
        System.out.println(System.getenv("url"));
        System.out.println(System.getenv("browserName"));
        System.out.println(System.getenv("environment"));
        System.out.println("Setup file");
        System.out.println(ReadJsonFile.JsonData("url"));
        System.out.println(ReadingPropertiesFile.getPropertyValue("username"));
        System.out.println(ReadingPropertiesFile.getPropertyValue("password"));
        driver=SetupDriver.DriverManager(System.getenv("browserName"));
    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println("Tear down");
        if(scenario.isFailed()){
            TakesScreenshot screenshot=(TakesScreenshot) driver;
            byte[] src=screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"img/png","error_file");
        }
        if(driver!=null){
            driver.manage().deleteAllCookies();
            driver.quit();
        }

    }

}

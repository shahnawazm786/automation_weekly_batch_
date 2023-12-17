package StepDefs;

import Utility.ReadJsonFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Apps_Hooks {
    static WebDriver driver;
    @Before
    public void setupDriver() throws IOException, ParseException {
        ChromeOptions options=new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.get(ReadJsonFile.JsonData("url"));
    }
    @After
    public void tearDownDriver(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
           // TakesScreenshot screenshot=(TakesScreenshot) driver;
           // byte[] src=screenshot.getScreenshotAs(OutputType.BYTES);
           // scenario.attach(src,"img/png","error_1");
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
            scenario.attach(fileContent, "image/png", "screenshot");
        }
        driver.quit();
    }
}

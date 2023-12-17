package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setUpDriver(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @After
    public void tearDownDriver(Scenario scenario) throws IOException {
        if(scenario.isFailed())
        {

            final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", "Errors");

            //File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
            //scenario.attach(fileContent, "image/png", "screenshot");

        }
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}

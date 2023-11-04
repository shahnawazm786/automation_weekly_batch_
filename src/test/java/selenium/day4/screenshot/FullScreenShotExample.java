package selenium.day4.screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class FullScreenShotExample {
    public static void main(String[] args) throws IOException,InterruptedException {
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        // Navigation method
        driver.get("file://C:/IntellijScalaWorkSpace/WeeklyAutomationBatch/html/default.html");
        driver.manage().window().maximize();
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:/files/screenshot.png"));
        Thread.sleep(5000);
        driver.quit();

    }
}

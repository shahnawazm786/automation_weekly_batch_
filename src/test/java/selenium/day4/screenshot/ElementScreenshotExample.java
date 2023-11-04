package selenium.day4.screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ElementScreenshotExample {
    public static void main(String[] args) throws IOException,InterruptedException {
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        // Navigation method
        driver.get("file://C:/IntellijScalaWorkSpace/WeeklyAutomationBatch/html/default.html");
        driver.manage().window().maximize();
        WebElement addressElement = driver.findElement(By.id("dob"));

        addressElement.click();
        File srcFile=addressElement.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("c:/files/element.png"));
        Thread.sleep(3000);
        driver.quit();

    }
}

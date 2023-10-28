package selenium.day3.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample1 {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Navigation method
        // Website open
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
        // maximize
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement ele = driver.findElement(By.linkText("See a sample confirm"));
        ele.click();
        Alert a = driver.switchTo().alert();
        a.dismiss();
        Thread.sleep(5000);
        driver.findElement(By.linkText("See a sample confirm")).click();
        //driver.findElement(By.linkText("See a sample confirm")).click();
        a = driver.switchTo().alert();
        a.accept();
        Thread.sleep(5000);
        driver.quit();
    }
}

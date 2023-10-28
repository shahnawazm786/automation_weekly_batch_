package selenium.day3.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        Thread.sleep(2000);
        driver.findElement(By.linkText("See a sample confirm")).click();

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

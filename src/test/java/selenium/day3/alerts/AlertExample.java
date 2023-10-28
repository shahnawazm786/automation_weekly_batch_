package selenium.day3.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Navigation method
        // Website open
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
        // maximize
        driver.manage().window().maximize();
        // Button find out
       // WebElement alertElement = driver.findElement(By.id("alertButton"));
        // Click operations
        //alertElement.click();
        driver.findElement(By.linkText("See an example alert")).click();
        Thread.sleep(2000);
        Alert a = driver.switchTo().alert();
        a.accept();
        Thread.sleep(5000);
        driver.quit();

    }
}

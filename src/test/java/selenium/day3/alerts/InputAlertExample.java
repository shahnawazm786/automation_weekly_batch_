package selenium.day3.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class InputAlertExample {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        actions.scrollToElement(driver.findElement(By.id("promtButton"))).build().perform();
        driver.findElement(By.id("promtButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        alert.sendKeys("KAZ-IT Training Hub");
        alert.accept();
        Thread.sleep(5000);
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(5000);
        alert.dismiss();
        Thread.sleep(5000);
        driver.quit();
    }
}

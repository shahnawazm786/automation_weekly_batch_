package selenium.day3.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertExample3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        Thread.sleep(2000);
        //driver.switchTo().frame(0);
        Actions actions=new Actions(driver);
        actions.scrollToElement(driver.findElement(By.id("confirmButton"))).build().perform();
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert a=wait.until(ExpectedConditions.alertIsPresent());
        a.accept();
        Thread.sleep(5000);
        driver.findElement(By.id("confirmButton")).click();
        a.dismiss();
        Thread.sleep(5000);
        driver.quit();
    }
}

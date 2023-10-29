package selenium.day3.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertExamples {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        actions.scrollToElement(driver.findElement(By.id("confirmButton"))).build().perform();
        driver.findElement(By.id("confirmButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        alert.accept();
        Thread.sleep(5000);
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(5000);
        alert.dismiss();
        Thread.sleep(5000);
        driver.quit();

    }
}

package selenium.day3.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertExample2 {
    public static void main(String[] args) throws Throwable{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        Thread.sleep(10000);
        //driver.switchTo().frame(0);
        Actions actions=new Actions(driver);
        actions.scrollToElement(driver.findElement(By.id("promtButton"))).build().perform();
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
        driver.quit();
    }
}

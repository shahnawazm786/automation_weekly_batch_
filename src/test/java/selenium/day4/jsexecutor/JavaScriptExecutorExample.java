package selenium.day4.jsexecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        // Navigation method
        driver.get("file://C:/IntellijScalaWorkSpace/WeeklyAutomationBatch/html/default.html");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement firstName=driver.findElement(By.id("fname"));
        js.executeScript("arguments[0].value='KAZ-IT Training Hub'",firstName);
        Thread.sleep(10000);
        WebElement registered = driver.findElement(By.xpath("//input[@type='submit']"));
        //registered.clear();
        js.executeScript("arguments[0].scrollIntoView()",registered);
        Thread.sleep(10000);
        js.executeScript("arguments[0].click()",registered);
        Thread.sleep(10000);
        js.executeScript("arguments[0].scrollTop=500",registered);
        Thread.sleep(10000);
        driver.quit();
    }
}

package selenium.day3.windowshandler.frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeExample {
    public static void main(String[] args) throws Throwable {
        //file:///C:/Users/shahn/OneDrive/Desktop/index.html
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/index.html");
        Thread.sleep(2000);
        //driver.switchTo().frame("iframe1");
        driver.switchTo().frame("iframe1");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.id("heading2"));
        String text=ele.getText();
        System.out.println(text);
        Thread.sleep(2000);
        driver.findElement(By.id("button1")).click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        driver.switchTo().parentFrame();
        driver.findElement(By.id("fname")).clear();
        driver.findElement(By.id("fname")).sendKeys("KAZ - IT ");
        Thread.sleep(2000);
        driver.switchTo().frame("iframe1");
        driver.switchTo().frame("iframe2");
        //button2
        driver.findElement(By.id("button2")).click();
        Thread.sleep(2000);
        alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        //driver.switchTo().parentFrame();
        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("lname")).clear();
        driver.findElement(By.id("lname")).sendKeys("Automation Testing");
        driver.quit();

    }
}

package selenium.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategy01 {
    public static void main(String[] args) throws Throwable{
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        // Navigation method
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/index.html");
        driver.manage().window().maximize();
        // Element by id
        WebElement lname = driver.findElement(By.id("lname"));
        Thread.sleep(10000);
        lname.clear();
        Thread.sleep(10000);
        lname.sendKeys("KAZ - Automation Training Hub");
        Thread.sleep(10000);
        driver.quit();
    }
}

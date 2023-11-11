package selenium.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoctorStrategyCSSSelectorExample  {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        // Navigation method
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //element find
        WebElement element = driver.findElement(By.cssSelector("input#email"));
        element.clear();
        element.sendKeys("KAZ-Software Automation Hub");
        Thread.sleep(2000);
        driver.quit();
    }
}

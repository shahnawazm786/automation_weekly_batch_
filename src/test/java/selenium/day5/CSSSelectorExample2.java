package selenium.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class CSSSelectorExample2 {
    public static void main(String[] args) throws InterruptedException{
        //
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        // Navigation method
        driver.get("https://jqueryui.com/tabs/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        //driver.findElement(By.cssSelector("li[class*=ui-corner]"));
        List< WebElement> elements =driver.findElements(By.cssSelector("li[class*=ui-corner]"));
        System.out.println(elements.size());
        driver.switchTo().parentFrame();
        //driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//div[@class='demo-description']"));
        Thread.sleep(10000);
        driver.close();
    }
}

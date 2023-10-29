package selenium.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoctorStrategyExample {
    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        // Navigation method
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/default.html");
        WebElement element = driver.findElement(By.tagName("div"));
        System.out.println(element.getTagName());
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.tagName("input"));
        System.out.println("Size " + elements.size());
        //WebElement element1 = driver.findElement(By.tagName("line"));
        List<WebElement> element1 = driver.findElements(By.tagName("line"));
        driver.quit();

    }
}

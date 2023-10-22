package selenium.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorGetTextExample {
    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        // Navigation method
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/index.html");
        driver.manage().window().maximize();
        // Element by id
        WebElement para1 = driver.findElement(By.id("para1"));
        Thread.sleep(2000);
        String text = para1.getText();
        System.out.println(text);
        Thread.sleep(2000);
        // Get the attribute value
        String attribute=para1.getAttribute("class");

        System.out.println("attribute \t "+attribute);
        attribute=para1.getAttribute("id");
        System.out.println("attribute \t "+attribute);
        // Get tag name
        System.out.println("Tag name"+ para1.getTagName());
        driver.quit();

    }
}

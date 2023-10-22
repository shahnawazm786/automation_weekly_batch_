package selenium.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategeByClasss {
    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        // Navigation method
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/index.html");
        driver.manage().window().maximize();
        // Element by id
        WebElement div = driver.findElement(By.className("div_info"));
        Thread.sleep(2000);
        String text = div.getText();
        System.out.println(text);
        // Get tag name
        System.out.println("Tag name \t" + div.getTagName());
        driver.quit();
    }
}

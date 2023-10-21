package selenium.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNavigationExample {
    public static void main(String[] args) throws  InterruptedException{
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a//span[text()='Downloads']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh(); // refresh
        driver.close();
    }
}

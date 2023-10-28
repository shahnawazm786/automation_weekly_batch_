package selenium.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_First_Class {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        // Navigation method
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // longer method
        //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // maximize
        driver.manage().window().maximize();
        // minimize
        Thread.sleep(1000);
        driver.manage().window().minimize();
        // full screen
        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        // default
        Thread.sleep(1000);
        driver.manage().window().maximize();
        // browser close
        driver.close(); // Single / Current browser close
        //driver.close(); // Multiple browser close
    }
}

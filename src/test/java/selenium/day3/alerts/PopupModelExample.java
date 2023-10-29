package selenium.day3.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class PopupModelExample {
    public static void main(String[] args) throws InterruptedException{
        ////button[text()='Full screen'] - click
        //https://getbootstrap.com/docs/5.3/components/modal/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://getbootstrap.com/docs/5.3/components/modal/");
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        try {
            actions.scrollToElement(driver.findElement(By.xpath("//button[text()='Full screen']"))).build().perform();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Full screen']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[text()='Close'])[11]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}

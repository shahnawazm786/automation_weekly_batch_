package selenium.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitStrategyExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("adder")).click();
        Wait<WebDriver> wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("box0"))));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("box0")));

        //wait.until(d->d.findElement(By.id("box0")).isDisplayed()); // selenium 4
        // internally pooling 500 millisecond
        boolean isDisplayed = driver.findElement(By.id("box0")).isDisplayed();

        if(isDisplayed){
            System.out.println("Displayed");
        }
        else
        {
            System.out.println("Not Displayed");
        }
        driver.quit();
}
}

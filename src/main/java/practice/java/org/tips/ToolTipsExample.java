package practice.java.org.tips;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ToolTipsExample {
    public static void main(String[] args) throws InterruptedException {
        //file:///C:/Users/shahn/OneDrive/Desktop/default.html
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://getbootstrap.com/docs/5.3/components/tooltips/");
        Actions actions=new Actions(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[1]"))));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[1]"))));
        //try {
        WebElement myElement=driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[1]/parent::div"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", myElement);
           // actions.scrollToElement(driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[1]/parent::div"))).build().perform();
            Thread.sleep(500);
            actions.moveToElement(driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[1]"))).build().perform();
        //}catch (Exception ex){
         //   ex.printStackTrace();
        //}
        String attributeValue=driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[1]")).getAttribute("data-bs-title");
        System.out.println(attributeValue);
        Thread.sleep(5000);
        driver.quit();
    }
}

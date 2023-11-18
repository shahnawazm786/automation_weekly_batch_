package selenium.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class FeedFormExample {
    public static <driver> void main(String[] args) throws InterruptedException {
        //firstName
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        // Elements
        driver.findElement(By.id("firstName")).sendKeys("Mohammad");
        driver.findElement(By.id("lastName")).sendKeys("Shahnawaz");
        driver.findElement(By.id("userEmail")).sendKeys("kazonline@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("label[for=gender-radio-1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("label[for=gender-radio-2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("label[for=gender-radio-3]")).click();
        //userNumber
        Thread.sleep(1000);
       driver.findElement(By.id("userNumber")).sendKeys("6789012345");
        Thread.sleep(1000);
        //dateOfBirthInput
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,600)");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("");
        driver.findElement(By.xpath("//div[text()='25']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[text()='Maths'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("label[for=hobbies-checkbox-1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("label[for=hobbies-checkbox-2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("label[for=hobbies-checkbox-3]")).click();
        Thread.sleep(10000);
        driver.quit();
    }
}

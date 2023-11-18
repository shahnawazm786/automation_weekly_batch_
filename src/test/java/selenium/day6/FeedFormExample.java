package selenium.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class FeedFormExample {
    public static void main(String[] args) throws InterruptedException {
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
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("25 Nov 2023");
        //driver.quit();
    }
}

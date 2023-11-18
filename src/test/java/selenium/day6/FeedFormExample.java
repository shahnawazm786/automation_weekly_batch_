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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
        Actions actions=new Actions(driver);
        actions.scrollToElement(driver.findElement(By.id("dateOfBirthInput"))).build().perform();
        actions.click(driver.findElement(By.id("dateOfBirthInput"))).build().perform();
        //actions.contextClick(driver.findElement(By.id("dateOfBirthInput"))).build().perform();
       // driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.ENTER);
//        //div[text()='19']
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='25']")).click();
        Thread.sleep(1000);
//        //subjectsInput
//        driver.findElement(By.id("subjectsInput")).sendKeys("Math");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[text()='Math']")).click();
//        //hobbies-checkbox-1
//        Thread.sleep(1000);
//        driver.findElement(By.id("hobbies-checkbox-1")).click();
//        //uploadPicture
//        Thread.sleep(1000);
//        driver.findElement(By.id("uploadPicture")).sendKeys("\\IntellijScalaWorkSpace\\WeeklyAutomationBatch\\image\\screenshot.png");
//        //currentAddress
//        Thread.sleep(1000);
//        driver.findElement(By.id("currentAddress")).sendKeys("South Delhi \n New Delhi \n 110017");
//        //react-select-3-input
//        driver.findElement(By.id("react-select-3-input")).click();
//        ////div[text()='Uttar Pradesh' and@id='react-select-3-option-1']
//        driver.findElement(By.xpath("//div[text()='Uttar Pradesh' and@id='react-select-3-option-1']")).click();
//        //submit
//        driver.findElement(By.id("submit")).click();
//        Thread.sleep(5000);
        //driver.quit();
    }
}

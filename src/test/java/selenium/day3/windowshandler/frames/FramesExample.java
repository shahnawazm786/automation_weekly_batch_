package selenium.day3.windowshandler.frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        //https://demoqa.com/frames
        driver.manage().window().maximize();
        driver.switchTo().frame(5);
        String str = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(str);
        driver.quit();
    }
}

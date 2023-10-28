package selenium.day3.windowshandler.frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        //https://demoqa.com/frames
        driver.manage().window().maximize();
        driver.switchTo().frame("frame2");
        String str = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(str);
        //parent frame
        //driver.switchTo().parentFrame();
        // root
        //driver.switchTo().defaultContent();
        //driver.switchTo().frame("frameblue");
       driver.quit();
    }
}

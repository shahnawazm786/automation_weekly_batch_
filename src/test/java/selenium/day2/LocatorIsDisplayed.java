package selenium.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIsDisplayed {
    public static void main(String[] args) throws Throwable{


    WebDriverManager.chromedriver().setup();//
    WebDriver driver = new ChromeDriver();
    // Navigation method
        driver.get("file:///C:/Users/shahn/OneDrive/Desktop/index.html");
        driver.manage().window().maximize();
    // Element by id
    WebElement link = driver.findElement(By.partialLinkText("Official Page"));
        Thread.sleep(2000);
    String text = link.getText();
        System.out.println(text);
    // Get tag name

        System.out.println("Tag name \t" + link.getTagName());
        Thread.sleep(2000);
        System.out.println("Link enable\t"+link.isEnabled());
        System.out.println("Link displayed \t"+link.isDisplayed());
        //link.click();
        Thread.sleep(5000);
        driver.quit();
}}

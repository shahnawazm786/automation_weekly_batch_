package selenium.day3.windowshandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsHandlerExample {
    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        //driver.switchTo().newWindow(WindowType.TAB);
        driver.findElement(By.id("windowButton")).click();
        //driver.switchTo().newWindow(WindowType.TAB);
        driver.findElement(By.id("windowButton")).click();
        //driver.switchTo().newWindow(WindowType.TAB);
        Set<String> window = driver.getWindowHandles();
        System.out.println(window);
        System.out.println("Windows open"+window.size());
        for(String win:window){
            driver.switchTo().window(win).manage().window().maximize();
            Thread.sleep(2000);

        }
        driver.quit();// close the window multiple windows
        //driver.close()// current and single window close
    }
}

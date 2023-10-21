package selenium.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title=driver.getTitle();
        System.out.println(title);
        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
        driver.quit();
    }
}

package selenium.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Selenium_Cookies_Example {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        // Navigation method
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies);
        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println(cookies);
        Cookie ck=new Cookie("user","Mohammad");
        driver.manage().addCookie(ck);
        cookies = driver.manage().getCookies();
        System.out.println(cookies);
        driver.quit();
    }
}

package Utility;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SeleniumFunctions {
    /**
     * Mohammad Shahnawaz
     * @param driver
     */
    public static void maximizeWindow(WebDriver driver){
        driver.manage().window().maximize();
        }

    /**
     * Mohammad Shahnawaz
     * @param driver
     * @param timeout in seconds
     */
    public static  void ImplicitWait(WebDriver driver,long timeout){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
        }

    /**
     * Mohammad Shahnawaz
     * @param driver
     * @param url
     */
    public static void webURL(WebDriver driver,String url){
            driver.get(url);
        }
}

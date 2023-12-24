package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumFunctions {
    /**
     * Mohammad Shahnawaz
     * @param driver
     */
    public static void Maximize(WebDriver driver){
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
    public static void APPURL(WebDriver driver,String url){
            driver.get(url);
        }

    /**
     *
     * @param driver
     * @param locator
     */
        public static void WaitToEnterData(WebDriver driver, WebElement locator){
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(locator));
        }
        public static void ClearText(WebDriver driver,WebElement element){
            WaitToEnterData(driver,element);
            element.clear();
        }
        public static void WaitElementToClick(WebDriver driver,WebElement locator){
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
        public static void SendText(WebDriver driver,WebElement element,String data){
            WaitToEnterData(driver,element);
            ClearText(driver,element);
            element.sendKeys(data);
        }

}

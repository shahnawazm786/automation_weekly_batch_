package steps;

import Utility.EBrowser;
import Utility.SeleniumFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupDriver {
    protected WebDriver driver;
    public WebDriver DriverManager(String browserName){
        if(browserName.equalsIgnoreCase(EBrowser.CHROME.toString())){
            System.out.println("Chrome Browser");
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--maximized--");
            driver=new ChromeDriver(options);
            SeleniumFunctions.maximizeWindow(driver);
            SeleniumFunctions.ImplicitWait(driver,10);
            SeleniumFunctions.webURL(driver,"https://www.google.com");


        }
        return driver;
    }
}

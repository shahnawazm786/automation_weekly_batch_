package Utility.drivers;

import Utility.SeleniumFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
    static public WebDriver driver;
    public static WebDriver getDriver(String browserName){
        switch (EMyBrowser.valueOf(browserName.toUpperCase())){
            case CHROME:
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--maximized");
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver(options);
                SeleniumFunctions.ImplicitWait(driver,20);
                SeleniumFunctions.APPURL(driver,System.getenv("url"));

                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                SeleniumFunctions.APPURL(driver,System.getenv("url"));
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                SeleniumFunctions.APPURL(driver,System.getenv("url"));
                break;
            case IE:
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
                SeleniumFunctions.APPURL(driver,System.getenv("url"));
                break;
            case SAFARI:
                WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
                SeleniumFunctions.APPURL(driver,System.getenv("url"));
                break;
        }
        return driver;
    }
}

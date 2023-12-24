package steps;

import Utility.EBrowser;
import Utility.ReadJsonFile;
import Utility.SeleniumFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class SetupDriver {
     WebDriver driver;
    public  WebDriver DriverManager(String browserName) throws IOException, ParseException {
        System.out.println(browserName);
        if(browserName.equalsIgnoreCase(EBrowser.CHROME.toString())){
            System.out.println("Chrome Browser");
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--start-maximized");
            driver=new ChromeDriver(options);
            //SeleniumFunctions.maximizeWindow(driver);
            SeleniumFunctions.ImplicitWait(driver,10);
            String url=System.getProperty("url");
            SeleniumFunctions.APPURL(driver, ReadJsonFile.JsonData("url"));
        }
        return driver;
    }
}

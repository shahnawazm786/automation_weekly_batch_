package Pages;

import Utility.ReadingPropertiesFile;
import Utility.SeleniumFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static org.junit.Assert.*;

public class OrnageHRMSLoginPage {
    public WebDriver driver;
    public OrnageHRMSLoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    // Locator define
    @FindBy(how= How.CSS,using = "input[name='username']")
    private WebElement TextBox_Username_CSS;
    @FindBy(how= How.CSS,using = "input[name='password']")
    private WebElement TextBox_Password_CSS;
    @FindBy(how= How.CSS,using = "button[type='submit']")
    private WebElement Button_Submit_CSS;
    @FindBy(how= How.CSS,using = "h6.oxd-topbar-header-breadcrumb-module")
    private WebElement Label_Header_CSS;



    /*private WebElement TextBox_Username_CSS=driver.findElement(By.cssSelector("input[name='username']"));
    private WebElement TextBox_Password_CSS=driver.findElement(By.cssSelector("input[name='password']"));
    private WebElement Button_Submit_CSS=driver.findElement(By.cssSelector("button[type='submit']"));

    private WebElement Label_Header_CSS=driver.findElement(By.cssSelector("h6.oxd-topbar-header-breadcrumb-module"));
    */



    //  action perform
    public void enterUserName() throws IOException {
        SeleniumFunctions.SendText(driver,TextBox_Username_CSS,ReadingPropertiesFile.getPropertyValue("username"));

        //SeleniumFunctions.WaitToEnterData(driver,TextBox_Username_CSS);
        //TextBox_Username_CSS.clear();
        //TextBox_Username_CSS.sendKeys("admin");
        //TextBox_Username_CSS.sendKeys(ReadingPropertiesFile.getPropertyValue("username"));
    }
    public void enterPassword() throws IOException {
        //TextBox_Password_CSS.clear();
        SeleniumFunctions.ClearText(driver,TextBox_Password_CSS);
        //TextBox_Password_CSS.sendKeys("admin123");
        TextBox_Password_CSS.sendKeys(ReadingPropertiesFile.getPropertyValue("password"));
    }
    public void clickOnSubmit(){
        Button_Submit_CSS.click();
    }
    public void verifyDashboardLabel() throws IOException {
        String dashboard = Label_Header_CSS.getText();
        assertEquals("Dashboard expected",ReadingPropertiesFile.getPropertyValue("DashbaordLevel"),dashboard);

    }
}

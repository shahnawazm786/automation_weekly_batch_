package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

public class OrnageHRMSLoginPage {
    public WebDriver driver;
    public OrnageHRMSLoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    // Locator define
    @FindBy(how= How.CSS,using = "input[name='username")
    private WebElement TextBox_Username_CSS;
    @FindBy(how= How.CSS,using = "input[name='password")
    private WebElement TextBox_Password_CSS;
    @FindBy(how= How.CSS,using = "button[type='submit']")
    private WebElement Button_Submit_CSS;
    @FindBy(how= How.CSS,using = "h6.oxd-topbar-header-breadcrumb-module")
    private WebElement Label_Header_CSS;

    //  action perform
    public void enterUserName(){
        TextBox_Username_CSS.clear();
        TextBox_Username_CSS.sendKeys("admin");
    }
    public void enterPassword(){
        TextBox_Password_CSS.clear();
        TextBox_Password_CSS.sendKeys("admin123");
    }
    public void clickOnSubmit(){
        Button_Submit_CSS.click();
    }
    public void verifyDashboardLabel(){
        String dashboard = Label_Header_CSS.getText();
        assertEquals("Dashboard expected","Dashboard1",dashboard);

    }
}

package withoutpagefactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmsLoginPage {
    WebDriver driver;
    By text_box_username_css= By.cssSelector("input[name='username']");
    By text_box_passsword_css=By.cssSelector("input[name='password']");
    By button_submit_css=By.cssSelector("");
    public OrangeHrmsLoginPage(WebDriver driver){
        this.driver=driver;
    }
    // Methods
    public void enterTextInUserTextBox(){
        driver.findElement(text_box_username_css).clear();
        driver.findElement(text_box_username_css).sendKeys("admein");
    }
    public void enterTextInPasswordTextBox(){
        driver.findElement(text_box_passsword_css).clear();
        driver.findElement(text_box_passsword_css).sendKeys("admin123");
    }
    public void clickOnSubmitButton(){
        driver.findElement(button_submit_css).click();
    }

}

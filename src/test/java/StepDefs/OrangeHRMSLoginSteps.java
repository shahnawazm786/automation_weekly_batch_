package StepDefs;


import Pages.OrnageHRMSLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import withoutpagefactory.pages.OrangeHrmsLoginPage;

import java.io.IOException;

import static org.junit.Assert.*;

public class OrangeHRMSLoginSteps {

//WebDriver driver=new Apps_Hooks().driver; object
    WebDriver driver=Apps_Hooks.driver;
    //OrnageHRMSLoginPage loginPage=new OrnageHRMSLoginPage(driver);
    OrangeHrmsLoginPage login=new OrangeHrmsLoginPage(driver);
    @Given("Open the login page")
    public void openTheLoginPage() {
    }

    @When("Enter user name in user text box")
    public void enterUserNameInUserTextBox() throws IOException {
        //loginPage.enterUserName();
        login.enterTextInUserTextBox();
    }

    @And("Enter password in password text box")
    public void enterPasswordInPasswordTextBox() throws IOException {

        //loginPage.enterPassword();
        login.enterTextInPasswordTextBox();

    }

    @And("I click on submit button")
    public void iClcikOnSubmitButton() {

        //loginPage.clickOnSubmit();
        login.clickOnSubmitButton();

    }

    @Then("I verify the user dashboard")
    public void iVerifyTheUserDashboard() throws IOException {
    //String dashboardText=driver.findElement(By.cssSelector("h6.oxd-topbar-header-breadcrumb-module"))
     //       .getText();

      //  assertEquals("Dashboard",dashboardText);
        //loginPage.verifyDashboardLabel();
    }
}

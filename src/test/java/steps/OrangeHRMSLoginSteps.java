package steps;

import Pages.OrnageHRMSLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import steps.Hooks;

public class OrangeHRMSLoginSteps {

WebDriver driver= Hooks.driver;
    OrnageHRMSLoginPage loginPage=new OrnageHRMSLoginPage(driver);
    @Given("Open the login page")
    public void openTheLoginPage() {
        System.out.println("Login page");

    }

    @When("Enter user name in user text box")
    public void enterUserNameInUserTextBox() {
        loginPage.enterUserName();

    }

    @And("Enter password in password text box")
    public void enterPasswordInPasswordTextBox() {
        loginPage.enterPassword();
    }

    @And("I click on submit button")
    public void iClcikOnSubmitButton() {
        loginPage.clickOnSubmit();
    }

    @Then("I verify the user dashboard")
    public void iVerifyTheUserDashboard() {
        loginPage.verifyDashboardLabel();
    }
}

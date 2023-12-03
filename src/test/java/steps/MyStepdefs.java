package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    @Given("open the browser")
    public void open_the_browser() {
        System.out.println("Browser");
    }

    @And("i pass the valid credential")
    public void iPassTheValidCredential() {
        System.out.println("Credential");
    }

    @When("i click on login button")
    public void iClickOnLoginButton() {
        System.out.println("Login Button");
    }

    @Then("i direct to the user dashboard")
    public void iDirectToTheUserDashboard() {
        System.out.println("Dashboard");

    }

    @And("i pass the invalid credential")
    public void iPassTheInvalidCredential() {
        System.out.println("In valid credential");
    }

    @And("i pass the valid credential user name {string} and password {string}")
    public void iPassTheValidCredentialUserNameKazAndPasswordKaz(String userName,String password) {
        System.out.println("Provider" + userName + "Password"+password);
    }

    @Given("dircted to reviewer dashboard")
    public void dirctedToReviewerDashboard() {
        System.out.println("Reviewer");
    }

    @Given("Open browser")
    public void openBrowser() {
        System.out.println("Open browser");
    }

    @When("pass the credential for different")
    public void passTheCredentialForDifferent() {
        System.out.println("Credntial");
    }

    @And("click to submit button")
    public void clickToSubmitButton() {
        System.out.println("Submit");
    }
}

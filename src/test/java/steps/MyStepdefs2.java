package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class MyStepdefs2 {
    @When("i am giving {string} and {string}")
    public void iAmGivingAnd(String username, String password) {
        System.out.println("User name \t"+ username);
        System.out.println("Password \t"+ password);
    }

    @And("i check the {string}")
    public void iCheckThe(String arg0) {
        System.out.println("Dashboard name "+arg0);
    }

    @And("i login {int} times")
    public void iLoginTimes(int arg0) {
        System.out.println("Counter \t"+arg0);
    }


}

package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MyStepdefs1 {
    @Then("i direct to the user dashboard and found {int} profile")
    public void iDirectToTheUserDashboardAndFoundProfile(int arg0) {
        System.out.println("Profile picture"+arg0);
    }

    @Given("dircted to originator dashboard")
    public void dirctedToOriginatorDashboard() {
        System.out.println("Originator");
    }

    @Given("dircted to participant dashboard")
    public void dirctedToParticipantDashboard() {
        System.out.println("Participant");
    }

    @Given("dircted to approval dashboard")
    public void dirctedToApprovalDashboard() {
        System.out.println("Approval");
    }

    @When("I am verifying the user {string}")
    public void iAmVerifyingTheUser(String arg0) {
        System.out.println("user name"+ arg0);
    }

    @Given("I am going to verify password {string}")
    public void iAmGoingToVerifyPassword(String arg0) {
        System.out.println("Password \t"+arg0);
    }

    @Given("I have the following books in the store")
    public void iHaveTheFollowingBooksInTheStore(DataTable books) {
        System.out.println(books);
        List<List<String>>  rows=books.asLists(String.class);
        for(List<String> row : rows){
            System.out.println(row.get(1));
        }
    }

    @When("I search for books by author Erik Larson")
    public void iSearchForBooksByAuthorErikLarson() {
        System.out.println("Frankling book name");
    }

    @Then("I find {int} books")
    public void iFindBooks(int arg0) {
        System.out.println("No of books \t"+arg0);
    }

    @And("The price is {double}")
    public void thePriceIs(double price) {
        System.out.println("Price is "+price);
    }
}

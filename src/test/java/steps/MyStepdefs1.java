package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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
}

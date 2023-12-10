package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BooksStepdefs {
    @Given("i have books {string}")
    public void iHaveBooks(String arg0) {
        System.out.println("Book name"+arg0);
    }

    @And("bookprice is {double}")
    public void priceIsPrice(double price ) {
        System.out.println("Price is \t"+price);
    }

    @When("bookpage is {int}")
    public void pageIsPage(int page) {
        System.out.println("Page is \t"+page);
    }

    @Then("publisher is {string}")
    public void publisherIs(String arg0) {
        System.out.println("Publisher is \t"+arg0);
    }

    @And("error message is {string}")
    public void errorMessageIs(String errormessage) {
        System.out.println("Error message\t"+errormessage);
        String newMessage="Invalid publisher";
        assertEquals(errormessage,newMessage);
    }


    @Given("book details example")
    public void bookDetailsExample(DataTable bookDetails) {
        List<List<String>> books=bookDetails.asLists();
        System.out.println(books);
        for(List<String> book : books){
            System.out.print("\tBook \t"+book.get(0));
            System.out.print("\tPublisher \t"+book.get(1));
            System.out.print("\tPrice \t"+book.get(2));
            System.out.print("\tPage \t"+book.get(3));
            System.out.println();
        }
    }
}

package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    protected WebDriver driver;
    @Before
    public void setup(){
        System.out.println("Setup file");
    }
    @After
    public void tearDown(){
        System.out.println("Tear down");
    }
}

package steps;

import Utility.ReadJsonFile;
import Utility.ReadingPropertiesFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Hooks {
    protected WebDriver driver;
    @Before
    public void setup() throws IOException, ParseException {
        System.out.println(System.getenv("url"));
        System.out.println(System.getenv("browserName"));
        System.out.println(System.getenv("environment"));
        System.out.println("Setup file");
        System.out.println(ReadJsonFile.JsonData("url"));
        System.out.println(ReadingPropertiesFile.getPropertyValue("username"));
        System.out.println(ReadingPropertiesFile.getPropertyValue("password"));
    }
    @After
    public void tearDown(){
        System.out.println("Tear down");
    }
}

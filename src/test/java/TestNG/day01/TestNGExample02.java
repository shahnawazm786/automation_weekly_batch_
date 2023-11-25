package TestNG.day01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample02 {

    @BeforeTest
    public void browserOpen(){
        System.out.println("Browser open method");
    }
    @Test
    public void test_004(){
        System.out.println("Test--04");
    }
    @AfterTest
    public void tearUp(){
        System.out.println("Screenshot method applied");
        System.out.println("Close browser");
    }
}

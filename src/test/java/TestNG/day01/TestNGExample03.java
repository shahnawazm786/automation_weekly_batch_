package TestNG.day01;

import org.testng.annotations.*;

public class TestNGExample03 {

    @Test
    public void test_004(){
        System.out.println("Test--04");
    }

    @BeforeMethod
    public void browserOpen(){
        System.out.println("Before method");
        System.out.println("Browser open method");
    }
    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("Before test method");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test ");
    }
    @AfterMethod
    public void tearUp(){
        System.out.println("After Method");
        System.out.println("Screenshot method applied");
        System.out.println("Close browser");
    }
}

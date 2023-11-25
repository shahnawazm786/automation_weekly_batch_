package TestNG.day01;

import org.testng.annotations.*;

public class TestNGExample04 {
    @Test
    public void test_004(){
        System.out.println("Test--04");
    }

    @BeforeMethod
    public void browserOpen(){
        System.out.println("Before Method");

    }
    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test ");
    }
    @AfterMethod
    public void tearUp(){
        System.out.println("After Method");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

}

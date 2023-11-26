package TestNG.day02;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Test(groups = {"Regression"},enabled = false)
public class MyRegressionTest {
    public void TestCase_001(){
        System.out.println("Test Case 001");
    }
    public void TestCase_002(){
        System.out.println("Test Case 002");
    }
    public void TestCase_003(){
        System.out.println("Test Case 003");
    }
    @Ignore
    @Test(enabled = false)
    public void TestCase_004(){
        System.out.println("Test Case 003");
    }
    @Ignore
    @Test(enabled = false)
    public void TestCase_005(){
        System.out.println("Test Case 003");
    }
    @Ignore
    @Test(enabled = false)
    public void TestCase_006(){
        System.out.println("Test Case 003");
    }
}

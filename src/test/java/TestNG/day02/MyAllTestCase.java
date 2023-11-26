package TestNG.day02;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class MyAllTestCase {
    @Parameters("browsername")
    @Test
    public void TC_00(String browsername){
        System.out.println("Sanity Test Case 001");
        System.out.println("Browser name"+browsername);
    }

    @Test(groups = {"Sanity"})
    public void TC_001(){
        System.out.println("Sanity Test Case 001");
    }
    @Test(groups = {"Sanity"})
    public void TC_002(){
        System.out.println("Sanity Test Case 002");
    }
    @Test(groups = {"Sanity"})
    public void TC_003(){
        System.out.println("Sanity Test Case 003");
    }
    @Test(groups = {"Regression"})
    public void TC_004(){
        System.out.println("Regression Test Case 004");
    }
    @Test(groups = {"Regression"})
    public void TC_005(){
        System.out.println("Regression Test Case 005");
    }
    @Test(groups = {"Regression"})
    public void TC_006(){
        System.out.println("Regression Test Case 006");
    }
    @Test(groups = {"Regression"})
    public void TC_007(){
        System.out.println("Regression Test Case 007");
    }
    @Test(groups = {"Regression"})
    public void TC_008(){
        System.out.println("Regression Test Case 008");
    }
}

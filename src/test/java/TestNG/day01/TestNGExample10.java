package TestNG.day01;

import org.testng.annotations.Test;

public class TestNGExample10 {
    @Test(groups = {"Sanity"})
    public void Test_001(){
        System.out.println("Test_001");
    }
    @Test(groups = {"Sanity"})
    public void Test_002(){
        System.out.println("Test_001");
    }
    @Test(groups = {"Sanity"})
    public void Test_003(){
        System.out.println("Test_001");
    }
    @Test(groups = {"Regression"})
    public void Test_004(){
        System.out.println("Test_001");
    }
    @Test(groups = {"Regression","Sanity"})
    public void Test_005(){
        System.out.println("Test_001");
    }
}

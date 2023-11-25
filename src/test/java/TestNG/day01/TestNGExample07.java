package TestNG.day01;

import org.testng.annotations.Test;

public class TestNGExample07 {
    @Test(priority = 3)
    public void test(){
        System.out.println("Test 008");
    }
    @Test(priority = 0)
    public void Test(){
        System.out.println("Test 009");
    }
    @Test(priority = 1)
    public void tEst(){
        System.out.println("Test 010");
    }
    @Test(priority = -1)
    public void teSt(){
        System.out.println("Test -1 teSt");
    }
    @Test(priority = -1)
    public void tesT(){
        System.out.println("Test tesT");
    }
}

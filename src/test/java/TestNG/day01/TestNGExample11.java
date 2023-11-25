package TestNG.day01;

import org.testng.annotations.Test;

public class TestNGExample11 {
    @Test(dependsOnMethods = "Test1")
    public void Test(){
        System.out.println("Test");
    }
    @Test(dependsOnMethods = "Test2")
    public void Test1(){
        System.out.println("Test1");
    }
    @Test
    public void Test2(){
        System.out.println("Test2");
    }
}

package TestNG.day01;

import org.testng.annotations.Test;

public class TestNgExample09 {
    @Test(invocationCount = 2,testName = "Sanity")
    public void SanityTest(){
        System.out.println("SanityTest()");
    }

    public void test1(){
        System.out.println("test1()");
    }
    @Test
    public void test2(){
        System.out.println("test()2");
    }
}

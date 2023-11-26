package TestNG.day02;

import org.testng.annotations.Test;

public class MyRegressionTest2 {
    @Test(timeOut = 1000,description = "Regression Test")
    public void TestCase_1001() throws InterruptedException
    {

        System.out.println("Test case 1001");
        Thread.sleep(1500);
    }
    @Test(priority = 2,alwaysRun = true,invocationCount = 4)
    public void TestCase_1002()
    {
        System.out.println("Test case 1002");
    }
}

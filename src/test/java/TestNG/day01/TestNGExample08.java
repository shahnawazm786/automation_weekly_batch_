package TestNG.day01;

import org.testng.annotations.Test;

public class TestNGExample08 {
    @Test(priority = 5)
    public void Apple(){
        System.out.println("Apple");
    }
    @Test
    public void Boy(){
        System.out.println("Boy");
    }
    @Test
    public void Cat(){
        System.out.println("Cat");
    }
    @Test(priority = -1,alwaysRun = true)
    public void Dog(){
        System.out.println("Dog");
    }
}

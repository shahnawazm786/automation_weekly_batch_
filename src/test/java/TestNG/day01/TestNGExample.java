package TestNG.day01;

import org.testng.SkipException;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;

public class TestNGExample {
    @Test
    public void test001(){
        System.out.println("Helloo!!! Test NG Method 1");
    }
    @Test
    public void test002(){
        System.out.println("Helloo!!! Test NG Method 2");
        assertFalse(true);
        System.out.println("Hello assertion failed");
    }
    @Test
    public void test003(){
        System.out.println("Helloo!!! Test NG Method 3");
        throw new SkipException("Skipping");
    }
}

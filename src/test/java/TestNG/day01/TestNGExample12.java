package TestNG.day01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGExample12 {
    @DataProvider(name = "studentName")
    public Object[][] getData(){
        String[][] name={{"Java"},{"C++"},{"Selenium"}};
        return name;
    }

    @Test(dataProvider = "studentName")
    public void Test(String name)
    {
        System.out.println(name);
    }
}

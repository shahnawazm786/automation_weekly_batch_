package TestNG.examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    @Parameters({"userName"})
    @Test(groups = {"Regression"})
    public void parameterTest(String userName){
        System.out.println("Parameter value"+userName);
    }
}

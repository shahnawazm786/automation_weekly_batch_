package TestNG.day02;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample01TestNG {

    @Test(dataProvider ="emp" )
    public void employeeTest(String name,int age,int sal,String gender)
    {
        System.out.println("Employee name"+name);
        System.out.println("Employee Age"+age);
        System.out.println("Employee Salary"+sal);
        System.out.println("Employee Gender"+gender);
    }

    @DataProvider(name = "emp")
    public Object[][] employeeDetails(){
        Object[][] name={
                {"Rahaman",23,5000,"Male"},
                {"Dawar",19,4000,"Male"},
                {"Geeta",22,3000,"Feamle"}
        };
        return  name;
    }

}

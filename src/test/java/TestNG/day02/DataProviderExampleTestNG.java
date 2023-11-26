package TestNG.day02;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviderExampleTestNG {

    @Test(dataProvider = "credential")
    public void loginValidation(String cred[]){
        System.out.println("Login name ->"+cred[0]);
        System.out.println("Password ->"+cred[1]);
        System.out.println("Password ->"+cred[2]);
        System.out.println("Password ->"+cred[3]);
        }
    @DataProvider(name = "credential")
    public Object[][] loginDetailsData(){
        Object[][] name={
                {"joe@gmail.com","joe","12-Jan-2023","47"},
                {"raja@yahoo.com","raja","12-Jan-1990","47"}};
        return  name;
    }

    /*
        User name | Password
        joe@gamil.com | joe
        raja@yahoo.com | raja
     */

}

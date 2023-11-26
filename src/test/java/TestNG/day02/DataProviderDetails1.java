package TestNG.day02;

import org.testng.annotations.DataProvider;

public class DataProviderDetails1 {
    @DataProvider(name="computer")
    public Object[][] bookDetails(){
        Object[][] books={
                {"Java",234,450.99,"Sun Microsystem"},
                {"Oracle",400,1000.67,"Oracle Corp"},
                {"c++",210,800.345,"Yashwant Kanitkar"},
                {"Microsoft SQL Server",650,1500.5,"Micorsoft corp"}
        };
        return books;
    }
}

package TestNG.day02;

import org.testng.annotations.Test;

public class DataProviderExample1 {
    // Testing book
    @Test(dataProvider = "computer",dataProviderClass = DataProviderDetails1.class)
    public void testAllBooks(String name,int noOfPage,double price,String publisher){
        System.out.println("Book name \t"+name);
        System.out.println("No of page\t"+noOfPage);
        System.out.println("Book price\t"+price);
        System.out.println("Book publisher\t"+publisher);

    }
    // Test All runs
    @Test
    public void testAllRuns(){

    }

}

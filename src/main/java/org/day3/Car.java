package org.day3;

import java.util.Date;

// Blue print of Car
public class Car {
    static int myclasscount=1; // class variable // we can access directly by class name classname.attibutename
    String model_no="10013456AF98"; //attribute of object
    public Car(String model_no){ // local variable of the method
        this.model_no=model_no;
    }
    int no_doors=4; // attribute of object
    int no_seats=4; // attribute of object
    //String color="Red"; // attribute of object
    String color; // string attribute - null hold // integer attribute = 0 hold
    Date dt;
    // behavior
    public void getStart(){
        System.out.println("Car has been started.......");
    }
    public void getMove(){
        System.out.println("Car moving now .............");
    }
    public void getStop(){
        System.out.println("Car stopped ...............");
    }
    // classname.methodname()
    public static void getCountIncrease(){
        myclasscount++;
        System.out.println(myclasscount);
    }
    // Constructor
    // A method which is named on Class
    // public
    // it has no return type
    // can have parameters
    public Car(){ // Constructor
        System.out.println("First execute this method");
    }

}

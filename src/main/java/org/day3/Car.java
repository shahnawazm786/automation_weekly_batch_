package org.day3;

import java.util.Date;

// Blue print of Car
public class Car {
    String model_no="10013456AF98"; //attribute
    int no_doors=4; // attribute
    int no_seats=4; // attribute
    //String color="Red"; // attribute
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
}

package org.day9.mulitlevel;

public class HondaClass extends CarClass{

    String carName;
    public void showCarName(String carName){
        this.carName=carName;
        System.out.println("Car name is "+this.carName);
    }
}

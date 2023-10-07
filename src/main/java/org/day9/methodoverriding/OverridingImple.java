package org.day9.methodoverriding;

public class OverridingImple {
    public static void main(String[] args) {
        //CarOne c=new CarOne();
        //c.marutiCar(); //
        //CarTwo c1=new CarTwo();
        //c1.marutiCar(); // CarTwo
        CarOne one=new CarTwo();// Overriding
        one.marutiCar();
    }
}

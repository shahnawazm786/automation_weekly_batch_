package org.day3;

public class CarClassImplementations {
    // Car - > Custom Classs
    public static void main(String[] args) {
        Car c; // c is the reference of class
        Car c1; // c1 is the reference of class
        // To access the class method and attribute
        // classrefrence.method/attribute;
        // to create object of the class
        c=new Car();
        System.out.println(c.color);
        System.out.println(c.dt);
        System.out.println("------- Method callled -------");
        c.getStart();
        c.getMove();
        c.getStop();
        System.out.println(Car.myclasscount);
        Car.getCountIncrease();

    }
}

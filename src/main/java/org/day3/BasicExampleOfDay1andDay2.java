package org.day3;

public class BasicExampleOfDay1andDay2 {
    public static void main(String[] args) {
        // basic swap two without using third variables
        int x=100;
        int y=200;
        int z=0;
        // out put x=200, y=100
        System.out.println("Before Swap");
        System.out.println("X->"+x);
        System.out.println("Y->"+y);

        z=x;
        x=y;
        y=z;
        System.out.println("After Swap");
        System.out.println("X->"+x);
        System.out.println("Y->"+y);





    }
}

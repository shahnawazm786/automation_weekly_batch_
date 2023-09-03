package org.day2;

public class AssignmentOperatorExample01Day02 {
    public static void main(String[] args) {
        // Assignment Operator (=)
        int x=20;
        System.out.println("Value of x is ->"+x);
        // +=
        x+=5; // x=x+5 -> x=20+5 -> x=25
        System.out.println("Value of x is ->"+x);
        x-=10;//x=x-10; // x=25-10= x=15
        System.out.println("Value of x is ->"+x);
        x*=3;//x=x*3;
        System.out.println("Value of x is ->"+x);
        x/=5;//x=x/5;
        System.out.println("Value of x is ->"+x);
        x%=2;//x=x%2;
        System.out.println("Value of x is ->"+x);
        ++x;
        System.out.println("Value of x is ->"+x);
        System.out.println("Post increment");
        System.out.println(x++);

        System.out.println("Value of x is ->"+x);

    }
}

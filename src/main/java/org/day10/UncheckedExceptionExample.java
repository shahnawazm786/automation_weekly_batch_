package org.day10;

import java.util.Scanner;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter second number");
        int y=sc.nextInt();
        int z=0;
        try {
            //z = x / y;
            z=100/0;
        }catch (ArithmeticException ae)
        {
            ae.printStackTrace(); // full message
            ae.getMessage(); // divide 0
            ae.toString(); // exception
            System.out.println(x+" \t is not divided by "+y);
        }
        System.out.println("Z ="+z);
    }
}

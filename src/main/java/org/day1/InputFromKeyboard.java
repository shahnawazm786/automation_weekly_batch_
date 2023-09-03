package org.day1;

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a value for X ->");
        int x=scanner.nextInt();
        System.out.println("Enter a value for Y ->");
        int y=scanner.nextInt();
        int result=x+y;
        System.out.println("Result ->"+result);
    }
}

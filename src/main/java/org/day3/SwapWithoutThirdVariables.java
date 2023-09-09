package org.day3;

public class SwapWithoutThirdVariables {
    public static void main(String[] args) {
        int num1=500;
        int num2=1000;
        System.out.println("Before Swap Value");
        System.out.printf("Value of Num1 -> %d and Value of Num2 -> %d",num1,num2);
        num1=num1+num2; //(precedence) num1=1500, num2=1000
        num2=num1-num2; // 1500-1000= 500 num2=500
        num1=num1-num2; // 1500 - 500 = 1000 num1=1000
        System.out.println("\nAfter Swap Value");
        System.out.printf("Value of Num1 -> %d and Value of Num2 -> %d",num1,num2);
    }
}

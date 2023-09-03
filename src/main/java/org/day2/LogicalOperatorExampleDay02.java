package org.day2;

public class LogicalOperatorExampleDay02 {
    public static void main(String[] args) {
        // result fix (true/false)
        // comparison operator
        // degree , age , percentage
        // degree = MCA -5 age 20 pec 60 // true
        System.out.println(5==5);
        System.out.println(20==20);
        System.out.println(60==60);
        System.out.println("&& Operator");
        System.out.println(5==5 && 20==20 && 60==60); // true
        System.out.println(5==5 && 20==20 && 70==60); // false
        System.out.println("|| Operator");
        System.out.println(5<10 || 100==200 || 60>50);// true
        System.out.println(5>10 || 100==200 || 60<50);// false
        System.out.println();

    }
}

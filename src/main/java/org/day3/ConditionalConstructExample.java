package org.day3;

public class ConditionalConstructExample {
    public static void main(String[] args) {
       int time=2; // unary operator
        System.out.println(12==12); // true // binary operator
        System.out.println(time==12); //false 13==12
       // turnary operator
        if(time>12 && time<15) {
           System.out.println("Good noon");
       }
        else if(time<=18 && time>15){
            System.out.println("Good after noon");
        }
        else if(time>=19 && time <=24){
            System.out.println("Goog evening");
        }
        else
        {
            System.out.println("Good morning");
        }

       // System.out.println("Good noon");
       // System.out.println("");
       // System.out.println("Good evening");
        // enter two number and compare which is greater
        // enter three number and compare which is greater
    }
}

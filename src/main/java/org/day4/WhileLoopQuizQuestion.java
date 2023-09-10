package org.day4;

public class WhileLoopQuizQuestion {
    public static void main(String[] args) {
        int x=1;
        while(true){ // universal true
            if(x>=10)
                break; // out of the loop
            System.out.println("Hello World \t" + x);
            x++;
        }
    }
}

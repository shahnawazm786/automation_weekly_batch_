package org.day4;

public class ContinueKeywordExample {
    public static void main(String[] args) {
        // break keyword
        int x=1;
        while(x<=10){
            System.out.println("Hello World\t X \t"+x);

            if(x==5) { // 5==5 - false
                break;
            }
            x++;
        }
        // continue keywords
        int y=1;
        while(y<=10){
            y++;
            if(y<=5){ // 1<=5 => true
                continue; // it is jumping to where condition is checked
            }
            System.out.println("Hello World\tY\t"+y);
        }
    }
}

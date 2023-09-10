package org.day4;

public class BreakExample {
    public static void main(String[] args) {
        int x=5;
        while(x<=30){
            System.out.print(x+"\t");
            if(x+10==24){
                break;
            }
            x++;
        }//while loop close
        System.out.println();
        System.out.println("Exit from while loop");
    }
}

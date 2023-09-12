package org.day4;

public class NestedLoopExample {
    public static void main(String[] args) {
        // Nested loop means loop within loop
        for(int x=1;x<=4;x++){
            for(int y=1;y<=4;y++){
                System.out.print(x+"  ");
            }
            System.out.println();
        }
        System.out.println("********************");
        for(int x=1;x<=4;x++){
            for(int y=1;y<=4;y++){
                System.out.print(y+"  ");
            }
            System.out.println();
        }
        System.out.println("********************");
        for(int x=1;x<=4;x++){
            for(int y=1;y<=x;y++){
                System.out.print(y+"  ");
            }
            System.out.println();
        }
        System.out.println("********************");
        for(int x=1;x<=4;x++){
            for(int y=x;y>=1;y--){
                System.out.print(y+"  ");
            }
            System.out.println();

        }
    }
}

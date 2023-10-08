package org.day10;

public class ThrowsKeyExample {
    public static void main(String[] args) throws Exception {
        check();
    }
    static void check(){
        NumberCheck nm=new NumberCheck();
        nm.devideMethod(100,0);
    }

}
class NumberCheck{
    void devideMethod(int x,int y) {
        try {
            System.out.println(x / y);
        } catch (Exception e) {
            System.out.println("Number devide by zero");
            // e.printStackTrace();
        }
    }
}

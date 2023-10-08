package org.day10;

public class Demo2 {
    public static void main(String[] args) {
        //throw new NullPointerException("Forcely throwing ");
        try {
            throw new CustomeExceptions("Forcely throws");
        }catch (CustomeExceptions ce){
            ce.printStackTrace();
        }
    }
}

package org.day10;

public class Demo1 {
    public static void main(String[] args) {
        try{

            throw new CustomeExceptions("My Exceptions");
        }catch (CustomeExceptions ce)
        {
            ce.printStackTrace();
        }
    }
}

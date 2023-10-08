package org.day10;

public class DemoCustomException {
    //public static void main(String[] args) throws Throwable {
    public static void main(String[] args) throws CustomeExceptions {
        int age=17;
        if(age<18){
            throw new CustomeExceptions("not allowed");
        }
    }
}

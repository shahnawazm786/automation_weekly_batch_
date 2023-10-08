package org.day10;

public class ErrorsExceptionExample {
    public static void main(String[] args) {
        int x=0;
        String name=null;
        System.out.println(name);
        try {
            System.out.println(name.length());// Exception
        }catch (NullPointerException n){

        }
        String name2=name;
        System.out.println(name2);
        System.out.println(x);
        Book b=new Book(); // constructor
        System.out.println(b.authorName);
    }
}

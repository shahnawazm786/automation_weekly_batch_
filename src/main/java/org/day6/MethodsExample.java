package org.day6;

public class MethodsExample {
    public static void main(String[] args) {

    }
    public static String getMyName(String name){
       String nameinuppercase=name.toUpperCase();
       String subString=nameinuppercase.substring(0,10);

        if(name.equalsIgnoreCase("KAZ"))
        return "KAZ";
       else
           return null;
    }

}

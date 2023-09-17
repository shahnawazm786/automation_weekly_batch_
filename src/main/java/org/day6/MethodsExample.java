package org.day6;

public class MethodsExample {
    public static void main(String[] args) {
        System.out.println(getMyName("learning kaz program kaz"));
    }
    public static String getMyName(String name){
        String subString;
        String nameinuppercase=name.toUpperCase();
        System.out.println("Length ->"+name.length());
        System.out.println("Index of K"+name.indexOf("k"));
        System.out.println("Index of K"+name.indexOf("z"));
        subString=nameinuppercase.substring(9,12);
        System.out.println(subString);
        if(subString.equalsIgnoreCase("KAZ"))
            return "KAZ";
        else
            return null;

    }

}

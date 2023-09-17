package org.day6;

public class MethodsExample {
    public static void main(String[] args) {
        System.out.println(getMyName("learning kaz program kaz"));
        System.out.println(getBiggerNumber(100,50));
        System.out.println(getDivisions(10,3));
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
    public static int getBiggerNumber(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
    public static double getDivisions(double a,double b){
        return a/b;
    }
    public static boolean getFlag(String name){
        if(name.length()>0)
            return true;
        else
            return false;
    }

}

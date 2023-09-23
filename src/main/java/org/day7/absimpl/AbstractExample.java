package org.day7.absimpl;

public abstract class AbstractExample {
    private final String appURL="https://www.google.com";
    private int employeeNo;
    double pie=3.141;
    int substract(int x,int y)// implementaion
    {
       return x-y;
    }
    abstract  void add(int a,int b);//intialize
    static void exampleAbs(){
        System.out.println("----- Static Method ----");
    }
}

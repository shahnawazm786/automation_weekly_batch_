package org.day7_01;

// Method overload
public class Polymorph {
    public void add(){
        System.out.println("Add with no parameter");
    }
    public void add(int a, int b){
        System.out.println("Add with two integer parameter");
    }
    public void add(double a, int b){
        System.out.println("Add with two integer parameter");
    }
    public void add(int a, double b){
        System.out.println("Add with two integer parameter");
    }
    public void add(int a, int b,int c){
        System.out.println("Add with two integer parameter");
    }
    public void add(double a, int b,int c){
        System.out.println("Add with two integer parameter");
    }
}


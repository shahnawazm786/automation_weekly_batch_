package org.day4;

public class ObjectForLoopExample {
    public static void main(String[] args) {
        /*String name="Java Language"; //Object
        for(char c : name.toCharArray()){ // for each loop
            System.out.println(c);
        }*/
        String[] lang={"C","Java","C++","Python"};
        for(String s:lang){
            System.out.println(s);
        }
        int[] num={10,20,30,40};
        for(int n:num){
            System.out.println(n);
        }
    }
}

package org.day5;

import java.sql.SQLOutput;

public class ClassImpl {
    public static void main(String[] args) {
        Animals a; // it create the reference
        a=new Animals();// we had created memory for Animals Object // anonymous reference
        Animals a1=new Animals();
        Animals a2 = new Animals();
        // and all object is unique
        if(a==a1){
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are not same");
        }
        System.out.println("Created a reference of Animal");
        Animals b; // reference
        b=a;
        if(a==b){
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are not same");
        }

        int k,l,m;
        k=100;
        l=k;
        m=k;
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        // Realtime
        // Garbage collect
        // Hacking
        a.color="Black";
        System.out.println(a.color);
        System.out.println(b.color);
        System.out.println(a1.color);

    }
}

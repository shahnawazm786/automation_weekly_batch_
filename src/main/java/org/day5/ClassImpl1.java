package org.day5;

public class ClassImpl1 {
    public static void main(String[] args) {
        Animals k=new Animals();
        k.color="Brown";
        System.out.println(k.color);
        Animals k1=new Animals();
        System.out.println(k1.color);
        Animals k2;
        k2=k;
        System.out.println(k2.color);
        if(k2==k)
            System.out.println("Both are same");

        if(k==k1)
            System.out.println("Both are same");
        else
            System.out.println("Both are not same");

    }
}

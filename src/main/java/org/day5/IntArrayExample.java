package org.day5;

public class IntArrayExample {
    public static void main(String[] args) {
        int[] a={40,60,70,80,7,300}; //inline declaration
        System.out.println(a[0]);
        System.out.println(a[4]);
        //System.out.println(a[6]);
        a[0]=100;
        System.out.println(a[0]);
        // for loop
        for(int i=0;i<a.length;i++){
            System.out.printf("%d on this index value is -> %d",i,a[i]);
            System.out.println();
        }
        // arrange in ascending order
        // first greater value
        int[] num= new int[6]; // size 6 define
        int j=100;
        for(int i=0;i<num.length;i++){
            num[i]=j*2-3+1-i*2;
        }
        System.out.println("Num Array Value");
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}

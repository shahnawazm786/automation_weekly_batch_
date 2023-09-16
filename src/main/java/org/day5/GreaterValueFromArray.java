package org.day5;

public class GreaterValueFromArray {
    public static void main(String[] args) {

        int[] a={40,35,70,-80,7,19}; //second or third
        int greater=a[0];
        //greater =40

        for(int i=0;i<a.length;i++){
            System.out.printf("%d  < %d = %b\n",greater,a[i],greater<a[i]);
                if(greater<a[i]){
                    greater=a[i];
                }

        }
        System.out.println("Greater value in the array is "+greater);

    }
}

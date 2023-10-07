package org.day9.string;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String name="KAZ";
        System.out.println(name);
        String a=name.substring(2);
        name.substring(2);// immutable
        //name=name+"\t Hello";
        System.out.println(name);
        System.out.println(a);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.equals("KAZ"));
        System.out.println(name.equalsIgnoreCase("kaz"));
        System.out.println(name.replace("K","Z"));
        System.out.println(name.repeat(5));
        String sentence="Hello my name is kaz";
        String[] splitSentence=sentence.split(" ");
        System.out.println(splitSentence);
        Arrays.stream(splitSentence).forEach(n-> System.out.println(n));
        for(String st :splitSentence){
            System.out.println(st);
        }


    }
}

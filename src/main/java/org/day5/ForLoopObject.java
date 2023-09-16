package org.day5;
import java.util.*;
import java.util.stream.Collectors;

public class ForLoopObject {
    public static void main(String[] args) {
        List<String> words=Arrays.asList("Java","Python","C Language","Oracle");
        System.out.println(words);
        //beofre 1.5
        for (int i=0;i<words.size();i++){
            System.out.println(words.get(i));
        }
        // 1.5 and after
        for(String w1:words){
            System.out.println(w1);
        }
        // modern forEach - java8,java11
        words.forEach(w-> System.out.println(w));

    }
    // Arrays -> consecutive location

}

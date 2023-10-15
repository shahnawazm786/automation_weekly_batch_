package org.day12.listinterface;
import java.util.*;
public class ListInterfaceExample {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        // List<T> l=new ArrayList<>(); // T represents object
        // to add object - add()
        list.add("Java");
        list.add("Oracle");
        System.out.println(list);
        // Iterations
        for(String st:list){
            System.out.println(st);
        }
        System.out.println("--Iterator Interface--");
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // foreach()
        System.out.println("-- For each loop --");
        list.stream().forEach(n-> System.out.println(n));
    }
}

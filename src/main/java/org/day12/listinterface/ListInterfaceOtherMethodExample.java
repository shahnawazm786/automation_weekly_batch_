package org.day12.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListInterfaceOtherMethodExample {
    public static void main(String[] args) {
        List<Integer> listInteger=new ArrayList<>();
        listInteger.add(new Integer(10)); // old convention
        listInteger.add(100);
        listInteger.add(300);
        listInteger.add(null);
        System.out.println(listInteger);
        // [] -> not allowed in collection
        //System.out.println(listInteger[0]);
        System.out.println(listInteger.get(0));
        System.out.println("Size of list ->"+listInteger.size());
        for(int i=0;i< listInteger.size();i++){
            System.out.println(listInteger.get(i));
        }
        // add 75 between 10 and 100
        listInteger.add(1,75);
        System.out.println(listInteger);
        // remove element
        listInteger.remove(new Integer(10));
        System.out.println(listInteger);
        listInteger.remove(0);
        System.out.println(listInteger);
        System.out.println("Remove all the elements");
        listInteger.clear();
        System.out.println(listInteger);
        System.out.println("contains the value in list");
        System.out.println(listInteger.isEmpty());
        listInteger.add(10);
        listInteger.add(6);
        listInteger.add(90);
        listInteger.add(35);
        listInteger.add(43);
        listInteger.add(100);
        listInteger.add(75);
        listInteger.add(90);
        listInteger.add(-100);
        listInteger.add(5);
        listInteger.add(135);
        listInteger.add(29);
        System.out.println("Unsorted list");
        System.out.println(listInteger);
        Collections.sort(listInteger);
        System.out.println(listInteger);
        System.out.println(listInteger.get(2));
        System.out.println(Collections.max(listInteger));
        System.out.println(Collections.min(listInteger));
        System.out.println(listInteger.contains(100));


    }
}

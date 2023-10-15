package org.day12.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceExample {
    public static void main(String[] args) {
        Set<String> name=new HashSet<>();
        name.add("Linux");
        name.add(null);
        name.add("Java");
        name.add("Oracle");
        name.add("SQL Server");
        name.add("Postgress");
        name.add(null);
        name.add("Unix");
        System.out.println(name);
        name.stream().forEach(a-> System.out.println(a));
        System.out.println(name.size());
        name.remove("Linux");
        System.out.println(name);
        name.add("Java");
        System.out.println(name);

    }
}

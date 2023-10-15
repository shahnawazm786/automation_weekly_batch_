package org.day12.mapinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapInterfaceExample {
    public static void main(String[] args) {
        //Map<K,V> -> K -> Key and V-> Value
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("Java",100);
        map.put("Oracle",150);
        map.put("SQL",500);
        map.put("Unix",1000);
        System.out.println(map);
        for(Map.Entry entry : map.entrySet()){
            System.out.println("Keys ->"+entry.getKey());
            System.out.println("Values ->"+entry.getValue());
        }
        System.out.println(map);
        map.put("Java",200);
        System.out.println("Added java key");
        System.out.println(map);
        map.put(null,900);
        System.out.println("Added null key");
        System.out.println(map);
        map.put(null,1900);
        System.out.println("Added another null key");
        System.out.println(map);
        map.put("PhP",null);
        System.out.println("Added null value");
        System.out.println(map);
        map.put("Python",null);
        System.out.println("Added one more null value");
        System.out.println(map);
        System.out.println("Remove null key");
        System.out.println(map.remove(null));
        System.out.println(map);
        System.out.println("Remove Python key and Python value");
        System.out.println(map.remove("Python",null));
        System.out.println(map);
        System.out.println("Add null key null value");
        map.put(null,null);
        System.out.println(map);
        System.out.println("Check Java key present or not");
        System.out.println(map.containsKey("Java"));
        for(String key: map.keySet()){
            System.out.print(key+",");
        }
        System.out.println();
        for(Integer value:map.values()){
            System.out.print(value+",");
        }
        System.out.println();
        map.remove(null,null);
        map.remove("PhP");
        System.out.println(map);
        List<Integer> integerList= map.values().stream().sorted().collect(Collectors.toList());
        System.out.println(integerList);

    }
}

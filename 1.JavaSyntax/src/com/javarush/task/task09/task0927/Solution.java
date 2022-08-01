package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap <String, Cat> catHashMap = new HashMap<>();
        catHashMap.put("Vaska1",new Cat("vaska1"));
        catHashMap.put("Vaska2",new Cat("vaska2"));
        catHashMap.put("Vaska3",new Cat("vaska3"));
        catHashMap.put("Vaska4",new Cat("vaska4"));
        catHashMap.put("Vaska5",new Cat("vaska5"));
        catHashMap.put("Vaska6",new Cat("vaska6"));
        catHashMap.put("Vaska7",new Cat("vaska7"));
        catHashMap.put("Vaska8",new Cat("vaska8"));
        catHashMap.put("Vaska9",new Cat("vaska9"));
        catHashMap.put("Vaska10",new Cat("vaska10"));
        return catHashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> s = new HashSet<>();
        for (Cat cat : map.values())
            s.add(cat);
        return s;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

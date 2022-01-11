package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> mapnew = new HashMap<>();
        mapnew.put("Юрганов1", "Владимир1");
        mapnew.put("Юрганов2", "Владимир2");
        mapnew.put("Юрганов3", "Владимир3");
        mapnew.put("Юрганов4", "Владимир");
        mapnew.put("Юрганов5", "Владимир5");
        mapnew.put("Юрганов6", "Владимир");
        mapnew.put("Юрганов1", "Владимир7");
        mapnew.put("Юрганов7", "Владимир8");
        mapnew.put("Юрганов4", "Владимир");
        mapnew.put("Юрганов3", "Владимир10");

        return mapnew;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Юрганов", 500);
        map.put("Юрганов2", 1500);
        map.put("Юрганов3", 2500);
        map.put("Юрганов4", 50);
        map.put("Юрганов5", 150);
        map.put("Юрганов6", 502);
        map.put("Юрганов7", 25);
        map.put("Юрганов8", 153);
        map.put("Юрганов9", 503);
        map.put("Юрганов10", 40);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Integer total = copy.get(key);

            if (total < 500 ) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {


    }
}
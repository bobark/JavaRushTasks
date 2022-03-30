package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map <String, String> map = new HashMap<>();
        map.put("Юрганов1", "Владимр1");
        map.put("Юрганов2", "Владимр2");
        map.put("Юрганов3", "Владимр");
        map.put("Юрганов4", "Владимр4");
        map.put("Юрганов5", "Владимр");
        map.put("Юрганов6", "Владимр6");
        map.put("Юрганов7", "Владимр7");
        map.put("Юрганов8", "Владимр");
        map.put("Юрганов9", "Владимр8");
        map.put("Юрганов10", "Владимр");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String,String> copy = new HashMap<>(map);

        for () {
            String key = pair.getKey();
            String value = pair.getValue();
            if () {

            }
        }
removeItemFromMapByValue(map, name);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}

package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Юрганов1", "Владимир");
        dictionary.put("Юрганова", "Владимира");
        dictionary.put("Юрганов4", "Владимир2");
        dictionary.put("Юрганов2", "Владимир3");
        dictionary.put("Юрганов3", "Владимир");
        dictionary.put("Юрганов", "Владимир2");
        dictionary.put("Юрганов7", "Владимир");
        dictionary.put("Юрганов8", "Владимир");
        dictionary.put("Юрганов9", "Владимир");
        dictionary.put("Юрганов10", "Владимир");
        return dictionary;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String nametmp: map.values()) {
            if (nametmp.equals(name)) {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String lastnametmp: map.keySet()) {
            if (lastnametmp.equals(lastName)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}

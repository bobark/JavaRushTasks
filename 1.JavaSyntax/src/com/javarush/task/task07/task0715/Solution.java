package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList <String> str = new ArrayList<>();
        str.add("мама");
        str.add("мыла");
        str.add("раму");

        str.add(1,"именно");
        str.add(3,"именно");
        str.add(5,"именно");

        for (String s : str) {
            System.out.println(s);
        }
    }
}

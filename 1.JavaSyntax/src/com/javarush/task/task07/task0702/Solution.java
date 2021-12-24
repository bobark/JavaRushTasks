package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] strings = new String[10];
        for (int i = 0; i < 8; i++) {
            strings[i] = reader.readLine();
        }
        strings[8] = "string9";
        strings[9] = "string10";
        for (int j = 0; j < 10 ; j++) {
            System.out.println(strings[9-j]);
        }
    }
}
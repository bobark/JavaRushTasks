package com.javarush.task.task07.task0703;

/*
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        String [] strings = new String[10];
        int [] num = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings[i] = reader.readLine();
            String s = strings[i];
            num[i] = s.length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }

    }
}

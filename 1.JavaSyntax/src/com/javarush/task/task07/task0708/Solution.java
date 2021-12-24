package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        int max = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) strings.add(i, reader.readLine());

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if (s.length() > max)
                max = s.length();

        }

        for (int i = 0; i < strings.size(); i++)  {
           String s = strings.get(i);

            if (s.length() == max)
                System.out.println(strings.get(i));
        }

    }
}

package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) strings.add(i, reader.readLine());

        int max = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if (s.length() < max)
                max = s.length();

        }

        for (int i = 0; i < strings.size(); i++)  {
            String s = strings.get(i);

            if (s.length() == max)
                System.out.println(strings.get(i));
        }

    }
}


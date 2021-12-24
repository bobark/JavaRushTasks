package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            str.add(s);
        }
        int max = str.get(0).length();
        int min = str.get(0).length();
        for (int i = 0; i < 10; i++) {
            if (max < str.get(i).length())
                max = str.get(i).length();
            if (min >str.get(i).length())
                min = str.get(i).length();
        }
        for (int i = 0; i < 10; i++) {
            if (str.get(i).length() == max) {
                System.out.println(str.get(i));
                return;
            }

            else if (str.get(i).length() == min) {
                System.out.println(str.get(i));
                return;
            }

        }
    }
}

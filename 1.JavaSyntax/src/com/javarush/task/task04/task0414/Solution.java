package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        
        int x;
        
        if (number % 400 == 0) {
            x = 366;
        } else if (number % 100 == 0) {
            x = 365;
        } else if (number % 4 == 0) {
            x = 366;
        } else {
            x = 365;
        }
        
        System.out.println("количество дней в году: " + x);

    }
}
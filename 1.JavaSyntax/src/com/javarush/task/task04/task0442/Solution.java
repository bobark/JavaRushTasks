package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       int sum =0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int number =Integer.parseInt(reader.readLine());
            sum = sum + number;
            if (number == -1)
            break;
        }
        System.out.println(sum);

    }
}

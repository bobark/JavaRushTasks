package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] data = new int[20];
        for (int i = 0; i < 20; i++) {
            data[i] = Integer.parseInt(reader.readLine());
        }
       return data;
    }

    public static int max(int[] array) {
        Arrays.sort(array);
        return  array[19];
    }
}

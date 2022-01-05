package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int maximum;
        int minimum;
        int[] massiv = getInts();
        maximum = massiv[0];
        minimum = massiv[0];
        for (int j : massiv) {
            if (maximum < j)
                maximum = j;
            if (minimum > j)
                minimum = j;
        }

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        int[] mas = new int[20];
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mas.length; i++) {
            String s = reader.readLine();
            mas [i] = Integer.parseInt(s);
        }
        return mas;
    }
}

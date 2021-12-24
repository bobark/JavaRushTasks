package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum1 = 0;
        int sum2 = 0;
        int[] street = new int[15];
        for (int i = 0; i < street.length; i++) {
            street[i] = Integer.parseInt(reader.readLine());

            if (i%2==0 ){
                sum2 = sum2 + street[i];
            }
            else
                sum1 = sum1 + street[i];
        }
        if (sum2 > sum1)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else  if (sum2 < sum1)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");


    }
}

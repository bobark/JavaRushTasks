package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int a = 0;
        int b = 0;
        if (number1>0)
            b++;
        else if (number1<0)
            a++;
        if (number2>0)
            b++;
        else if (number2<0)
            a++;
        if (number3>0)
            b++;
        else if (number3<0)
            a++;

        System.out.println("количество отрицательных чисел: "+ a);
        System.out.println("количество положительных чисел: "+ b);
    }
}

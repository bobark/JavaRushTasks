package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String a= bufferedReader.readLine();
    int b = Integer.parseInt(a);

    if (b<0)
        System.out.println(b+1);
    else if (b>0)
        System.out.println(b*2);
    else
        System.out.println(0);

    }

}
package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int len = String.valueOf(number).length();
        if (number >=1 && number <= 999){
            if (number%2==0 && len ==1 )
                System.out.println("четное однозначное число");
            else if (number%2==0 && len ==2 )
                System.out.println("четное двузначное число");
            else if (number%2==0 && len ==3 )
                System.out.println("четное трехзначное число");
            else if (number%2 !=0 && len == 1 )
                System.out.println("нечетное однозначное число");
            else if (number%2 !=0 && len == 2 )
                System.out.println("нечетное двузначное число");
            else if (number%2 !=0 && len == 3 )
                System.out.println("нечетное трехзначное число");


        }


    }
}

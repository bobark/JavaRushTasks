package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 =Integer.parseInt(reader.readLine());
        int number2 =Integer.parseInt(reader.readLine());
        int number3 =Integer.parseInt(reader.readLine());
        int number4 =Integer.parseInt(reader.readLine());

        if (number1 > number2 && number1 > number3 && number1 > number4)
            System.out.println(number1);
        else  if (number2 >= number1 && number2 >= number3 && number2 >= number4)
            System.out.println(number2);
        else if (number3 >= number1 && number3 >= number2 && number3 >= number4)
            System.out.println(number3);
        else  if (number4 >= number2 && number4 >= number3 && number4 >= number1)
            System.out.println(number4);

    }
}

package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 =Integer.parseInt(reader.readLine());
        int number2 =Integer.parseInt(reader.readLine());
        int number3 =Integer.parseInt(reader.readLine());

        if ((number1 >= number2 && number2 >= number3) || (number3 >= number2 && number2 >= number1))
            System.out.println(number2);
        else if ((number1 >= number3 && number3 >= number2 ) || (number2 >= number3 && number3 >= number1 ) )
            System.out.println(number3);
        else if ((number2 >= number1 && number1 >= number3) || (number3 >= number1 && number1 >= number2))
            System.out.println( number1);

    }
}

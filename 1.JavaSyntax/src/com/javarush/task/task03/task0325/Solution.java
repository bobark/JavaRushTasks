package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
String money = bufferedReader.readLine();
        System.out.println("Я буду зарабатывать $"+ money + " в час");
    }
}

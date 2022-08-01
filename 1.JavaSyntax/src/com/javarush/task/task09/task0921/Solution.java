package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> list = new ArrayList<>();
        try {

            while (true) {
                int number =Integer.parseInt(reader.readLine());
                list.add(number);
            }


        } catch (Exception e) {

        }
        finally {
           for (int n:list){
               System.out.println(n);
           }
        }

    }
}

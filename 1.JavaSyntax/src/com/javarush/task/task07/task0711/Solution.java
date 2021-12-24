package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
       ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String sstring = reader.readLine();
            str.add(sstring);
        }

        for (int i = 0; i < 13; i++) {
           String s = str.remove(4);
           str.add(0,s);

        }
        for (String s : str) {
            System.out.println(s);
            
        }
    }
}

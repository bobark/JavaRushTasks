package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> string = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            string.add(s);
        }
        string.remove(2);

        for (int i = 0; i < string.size(); i++) {
            int j = string.size() -i - 1;
            System.out.println(string.get(j));
            
        }
    }
}

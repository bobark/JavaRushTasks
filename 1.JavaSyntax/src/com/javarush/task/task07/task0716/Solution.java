package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> res2 = new ArrayList<>();

        for (String s : strings) {
            if (s.contains("р") && s.contains("л")) {
                res2.add(0,s);
            }
            if (s.contains("л") && !s.contains("р")) {
                res2.add(0,s);
                res2.add(0,s);

            }
            if (!s.contains("р") && !s.contains("л")) {
                res2.add(0,s);
            }


        }

        return res2;
    }
}
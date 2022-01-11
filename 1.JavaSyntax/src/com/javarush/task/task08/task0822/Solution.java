package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int m = array.get(0);
        for (int n : array) {

            if (n < m) {
                m = n;
            }
        }
        return m;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(reader.readLine()));
        }

        return num;
    }
}

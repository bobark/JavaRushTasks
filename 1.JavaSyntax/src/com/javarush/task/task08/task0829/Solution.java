package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map1 = new HashMap<>();
        while (true) {
            String sity = reader.readLine();
            if (sity.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            map1.put(sity, family);

        }

        // Read the house number
        String town = reader.readLine();

        if (map1.containsKey(town))
            System.out.println(map1.get(town));
        }
    }


package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName =  reader.readLine();


        FileInputStream fileInputStream = new FileInputStream(inputFileName);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
        int i;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (bufferedReader.ready()) {
            String str = bufferedReader.readLine();
            i = Integer.parseInt(str);
            if ((i % 2) == 0 & i != 0) {
                arrayList.add(i);
            }
            Collections.sort(arrayList);

        }
        for (Integer character : arrayList) {
            System.out.println(character);
        }
        fileInputStream.close();
    }

}

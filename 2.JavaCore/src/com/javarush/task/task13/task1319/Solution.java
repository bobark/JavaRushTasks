package com.javarush.task.task13.task1319;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String outputFileName = reader.readLine();

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

        while (true){
           String line = reader1.readLine();
            writer.write(line + "\n");
            if (line.equals("exit")) break;
        }

        writer.close();
    }
}

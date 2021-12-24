package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        return str1;
    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number =Integer.parseInt(reader.readLine());
        return number;

    }

    public static double readDouble() throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       double res = Double.parseDouble(reader.readLine());
        return res;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        boolean i = false;
        if (Objects.equals(str, "true")){
             i = true;
        }
        if (Objects.equals(str, "false")){
            i = false;
        }
        return i;

    }

    public static void main(String[] args) throws Exception {

    }
}

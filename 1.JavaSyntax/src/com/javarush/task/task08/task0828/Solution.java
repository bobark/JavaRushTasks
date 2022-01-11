package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        ArrayList<String> list = new ArrayList<>();
        list.add( "January");
        list.add( "February");
        list.add( "March");
        list.add( "April");
        list.add( "May");
        list.add( "June");
        list.add( "July");
        list.add( "August");
        list.add( "September");
        list.add( "October");
        list.add( "November");
        list.add( "December");

        if (list.contains(month)) {
            System.out.println(month + " is the " + (list.indexOf(month) + 1) + " month");
        }


    }
}

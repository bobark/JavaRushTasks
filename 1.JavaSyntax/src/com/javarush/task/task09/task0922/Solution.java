package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String strDate = reader.readLine();
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-d", Locale.ENGLISH);
       SimpleDateFormat formater = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);

       try {
           Date date = formatter.parse(strDate);

           System.out.println(formater.format(date).toUpperCase());
       }
       catch (ParseException e){
           e.printStackTrace();
       }




    }
}
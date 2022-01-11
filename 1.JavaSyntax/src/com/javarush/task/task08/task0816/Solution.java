package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов2", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("Смирнов3", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Смирнов4", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов5", dateFormat.parse("July 1 2012"));
        map.put("Смирнов6", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов7", dateFormat.parse("August 2 2014"));
        map.put("Смирнов8", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов9", dateFormat.parse("June 1 2012"));
        map.put("Смирнов10", dateFormat.parse("MAY 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args)  {


    }
}

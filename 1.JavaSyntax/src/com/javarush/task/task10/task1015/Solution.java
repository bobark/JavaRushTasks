package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
       ArrayList <String>[] arrayList = new ArrayList[10];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i]= new ArrayList<String>();

        }
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[1]
        }

        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
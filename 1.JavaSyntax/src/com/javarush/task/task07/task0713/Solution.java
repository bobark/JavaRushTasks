package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();
        ArrayList <Integer> list4 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int n = Integer.parseInt(reader.readLine());
            list1.add(n);
        }

        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i)%3 ==0)
                list2.add(list1.get(i));
            if (list1.get(i)%2 ==0)
                list3.add(list1.get(i));
            if ((list1.get(i) % 3 != 0)&&(list1.get(i) % 2 != 0))
                list4.add(list1.get(i));
        }


        printList(list2);
        printList(list3);
        printList(list4);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}

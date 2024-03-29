package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement [] elements = Thread.currentThread().getStackTrace();

        System.out.println(elements[2].getClassName() + ": " + elements[2].getMethodName() + ": " + text);
    }
}

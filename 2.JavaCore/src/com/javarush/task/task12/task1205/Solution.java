package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String nameClass = o.getClass().getSimpleName();
      String s="";
        switch (nameClass){
            case("Cow"):s="Корова" ;break;
            case("Dog"):s="Собака" ;break;
            case("Whale"): s="Кит" ;break;
            case("Pig"):s="Неизвестное животное" ;break;
        }

        return s;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}

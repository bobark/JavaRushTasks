package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    private String name;
    private int height;
    private String color;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int heidht)
    {
        this.name = name;
        this.height = heidht;
    }

    public void initialize(String name, int heidht, String color) {
        this.name = name;
        this.height = heidht;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}

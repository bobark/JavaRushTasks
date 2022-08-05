package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
    private int age;
    private String name;
    private String fullname;
    private int weht;
    private String sex;
    private int attack;
        public Human(int age, String name, String fullname, int weht) {
            this.age = age;
            this.name = name;
            this.fullname = fullname;
            this.weht = weht;
        }

        public Human(String sex, int attack) {
            this.sex = sex;
            this.attack = attack;
        }

        public Human(String name, String fullname, int weht, String sex) {
            this.name = name;
            this.fullname = fullname;
            this.weht = weht;
            this.sex = sex;
        }

        public Human(int age, String name, String fullname) {
            this.age = age;
            this.name = name;
            this.fullname = fullname;
        }



        public Human(int age) {
            this.age = age;
        }

        public Human(String fullname, int weht, String sex) {
            this.fullname = fullname;
            this.weht = weht;
            this.sex = sex;
        }

        public Human(int age, int weht) {
            this.age = age;
            this.weht = weht;
        }

        public Human(int age, String name, int weht, String sex) {
            this.age = age;
            this.name = name;
            this.weht = weht;
            this.sex = sex;
        }

        public Human(int weht, String sex, int attack) {
            this.weht = weht;
            this.sex = sex;
            this.attack = attack;
        }

        public Human(int age, String name, String fullname, int weht, String sex, int attack) {
            this.age = age;
            this.name = name;
            this.fullname = fullname;
            this.weht = weht;
            this.sex = sex;
            this.attack = attack;
        }
    }
}

package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12,5);
        Dog bob = new Dog("Bob", 12,5);
        Cat Tom = new Cat("Tom", 2,4);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog {
        String name;
        int height;
        int weiht;

        public Dog(String name, int height, int weiht) {
            this.name = name;
            this.height = height;
            this.weiht = weiht;
        }
    }
    public static class Cat {
        String name;
        int height;
        int power;

        public Cat(String name, int height, int power) {
            this.name = name;
            this.height = height;
            this.power = power;
        }
    }

    //напишите тут ваш код
}

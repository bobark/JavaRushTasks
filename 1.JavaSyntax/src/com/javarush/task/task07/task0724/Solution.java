package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human bob = new Human("bobark",true,15);
        Human bob2 = new Human("bobark2",true,18);
        Human bob3 = new Human("bobark3",true,5);
        Human bob4 = new Human("bobark4",false,25);
        Human tom1 = new Human("tom",false,25,bob,bob4);
        Human tom2 = new Human("tom2",false,25,bob,bob4);
        Human tom3 = new Human("tom3",true,25,bob,bob2);
        Human tom4 = new Human("tom4",false,25,bob2,bob3);
        Human tom5 = new Human("tom5",false,25,bob4,bob3);

        System.out.println(bob);
        System.out.println(bob2);
        System.out.println(bob3);
        System.out.println(bob4);
        System.out.println(tom1);
        System.out.println(tom2);
        System.out.println(tom3);
        System.out.println(tom4);
        System.out.println(tom5);

    }

    public static class Human {
         String name;
         boolean sex;
         int age;
         Human father;
         Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
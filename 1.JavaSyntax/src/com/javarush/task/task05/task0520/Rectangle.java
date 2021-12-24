package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    public int left, top, width, height ;

    public Rectangle (int left, int top, int width, int heigth){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height  =heigth;
    }
    public Rectangle (int left, int top){
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height  =0;
    }
    public Rectangle (int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height  =width;
    }
    public Rectangle (int left){
        this.left = left;
        this.top = 1;
        this.width = 2;
        this.height  =2;
    }


    public static void main(String[] args) {

    }
}

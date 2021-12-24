package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    public int  top;
    public int  left;
    public int  width;
    public int  height;

    public void initialize (int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height =0;
    }
    public void initialize (int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize (int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = this.width;
    }
    public void initialize (int top){
        this.top = top;
        this.left = 2;
        this.width = 3;
        this.height =5;
    }





    public static void main(String[] args) {

    }
}

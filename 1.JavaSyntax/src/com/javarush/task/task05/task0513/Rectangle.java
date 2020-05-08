package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int  top, left, width, height;

    public void initialize(int top) {
        this.top = top;
    }

    public void initialize(int top, int height) {
        this.top = top;
        this.height = height;
    }
    public void initialize(int top, int left, int height) {
        this.top = top;
        this.height = height;
        this.left = left;
    }

    public void initialize(int top, int left, int height, int width) {
        this.top = top;
        this.height = height;
        this.left = left;
        this.width = width;
    }

    public static void main(String[] args) {

    }
}

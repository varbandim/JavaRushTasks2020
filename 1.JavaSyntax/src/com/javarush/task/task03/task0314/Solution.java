package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
    int a=1, b=1; 
        while (a<=10){
            while (b<=10){
                System.out.print(" " + a*b+" ");
                b++;
            }
            b=1;
            System.out.println();
            a++;
        }
    }
}

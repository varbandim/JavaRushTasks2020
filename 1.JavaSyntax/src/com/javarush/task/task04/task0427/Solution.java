package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());

        if (a < 10 && a > 0 && a % 2 == 0) System.out.println("четное однозначное число");
        else if (a < 10 && a % 2 != 0) System.out.println("нечетное однозначное число");
        else if (a < 100 && a > 9 && a % 2 == 0) System.out.println("четное двузначное число");
        else if (a < 100 && a > 9 && a % 2 != 0) System.out.println("нечетное двузначное число");
        else if (a < 1000 && a > 99 && a % 2 == 0) System.out.println("четное трехзначное число");
        else if (a < 1000 && a > 99 && a % 2 != 0) System.out.println("нечетное трехзначное число");

    }
}

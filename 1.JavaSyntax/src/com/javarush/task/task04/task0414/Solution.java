package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String result = "количество дней в году: 365";
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(r.readLine());

        if (year % 400 == 0) result = "количество дней в году: 366";
        if (year % 4 == 0 && year % 100 != 0) result = "количество дней в году: 366";

        System.out.println(result);
    }
}
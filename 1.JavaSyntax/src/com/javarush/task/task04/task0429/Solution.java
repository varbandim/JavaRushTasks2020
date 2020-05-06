package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        int positive = 0;
        if (a > 0) {
            positive++;
        }
        if (b > 0) {
            positive++;
        }
        if (c > 0) {
            positive++;
        }
        int negative = 0;
        if (a < 0) {
            negative++;
        }
        if (b < 0) {
            negative++;
        }
        if (c < 0) {
            negative++;
        }

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
    }
}

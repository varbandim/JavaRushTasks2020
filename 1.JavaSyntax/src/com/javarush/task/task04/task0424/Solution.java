package com.javarush.task.task04.task0424;

/* 
Три числа
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

        int i = 0;
        if (a != b && b == c) {
            i = 1;
            System.out.println(i);
        }
        if (b != a && a == c) {
            i = 2;
            System.out.println(i);
        }
        if (c != a && a == b) {
            i = 3;
            System.out.println(i);
        }
    }
}

package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        System.out.println(max(a, b, c) + " " + med(a, b, c) + " " + min(a, b, c));
    }

    static int max(int a, int b, int c) {
        int res = a;
        if (a >= b && a >= c) res = a;
        else if (b >= a && b >= c) res = b;
        else if (c >= a && c >= b) res = c;
        return res;
    }

    static int med(int a, int b, int c) {
        int res = a;
        if ((a >= b && a <= c) || (a <= b && a >= c)) res = a;
        if ((b >= a && b <= c) || (b <= a && b >= c)) res = b;
        if ((c >= b && c <= a) || (c <= b && c >= a)) res = c;
        return res;
    }

    static int min(int a, int b, int c) {
        int res = a;
        if (a <= b && a <= c) res = a;
        else if (b <= a && b <= c) res = b;
        else if (c <= a && c <= b) res = c;
        return res;
    }
}

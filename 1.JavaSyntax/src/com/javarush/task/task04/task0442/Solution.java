package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true) {
            int n = Integer.parseInt(r.readLine());
            a += n;
            if (n == -1) {
                break;
            }
        }
        System.out.println(a);
    }
}

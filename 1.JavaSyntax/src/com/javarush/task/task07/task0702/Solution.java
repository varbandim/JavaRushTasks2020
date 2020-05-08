package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] arrStr = new String[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            arrStr[i] = r.readLine();
        }

        for (int i = 9; i >= 0 ; i--) {
            System.out.println(arrStr[i]);
        }
        r.close();
    }
}
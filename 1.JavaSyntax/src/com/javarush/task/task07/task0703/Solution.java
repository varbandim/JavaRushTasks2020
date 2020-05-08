package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] arrStr = new String[10];
        int[] arrInt = new int[10];

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrStr[i] = r.readLine();
        }

        for (int i = 0; i < 10; i++) {
            arrInt[i] = arrStr[i].length();
        }

        for (int a :
                arrInt) {
            System.out.println(a);
        }
        r.close();
    }
}

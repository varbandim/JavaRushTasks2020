package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrInt = new int[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(r.readLine());
        }
        r.close();

        for (int i = 9; i >= 0 ; i--) {
            System.out.println(arrInt[i]);
        }
    }
}


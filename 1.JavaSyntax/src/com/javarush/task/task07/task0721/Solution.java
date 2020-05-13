package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] num = new int[20];
        for (int i = 0; i < 20; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        maximum = num[0];
        minimum = num[0];
        for (int i = 0; i < num.length; i++) {
            if (maximum < num[i]) maximum = num[i];
            if (minimum > num[i]) minimum = num[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}

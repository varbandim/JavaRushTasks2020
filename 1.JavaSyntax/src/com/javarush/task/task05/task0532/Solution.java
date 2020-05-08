package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код
        int count = Integer.parseInt(reader.readLine());
        if (count > 0) {
            maximum = Integer.parseInt(reader.readLine());
            for (int i = 1; i < count; i++) {
                int n = Integer.parseInt(reader.readLine());
                maximum = maximum > n ? maximum : n;
            }

            System.out.println(maximum);
        }
    }
}

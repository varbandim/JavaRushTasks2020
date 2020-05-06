package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int count = 0;

        while (true) {
            int n = Integer.parseInt(r.readLine());
            if (n != -1) {
                sum += n;
                count++;
            } else break;
        }
        double av = (double)sum/(double)count;
        System.out.println(av);
    }
}


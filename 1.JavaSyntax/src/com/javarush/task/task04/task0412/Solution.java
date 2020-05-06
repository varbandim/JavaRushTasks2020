package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(read.readLine());
        if (a > 0) {
            a *= 2;
            System.out.println(a);
        } else{
            if (a < 0) {
                a += 1;
                System.out.println(a);
            } else{
                System.out.println(a);
            }
        }
    }

}
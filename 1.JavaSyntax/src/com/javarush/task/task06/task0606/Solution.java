package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String sNum = (r.readLine());
        int n = 0;
        even = 0;
        odd = 0;
        int num = Integer.parseInt(sNum);
        for (int i = 0; i < sNum.length(); i++) {
            n = num % 10;
            num = (num - n) / 10;
            if (n % 2 == 0) even++; else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}

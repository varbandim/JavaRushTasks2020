package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] arrInt = new int[15];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(r.readLine());
        }
        r.close();

        int sumn = 0;
        int sumc = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (i % 2 == 0) sumc += arrInt[i];
            else sumn += arrInt[i];
        }

        String result = sumc > sumn? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(result);
    }
}

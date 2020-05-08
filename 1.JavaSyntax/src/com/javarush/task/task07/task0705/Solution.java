package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrInt = new int[20];
        int[] arrInt1 = new int[10];
        int[] arrInt2 = new int[10];

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(r.readLine());
        }
        r.close();

        for (int i = 0; i < arrInt.length / 2; i++) {
            arrInt1[1] = arrInt[i];
        }

        for (int i = 0; i < arrInt.length/2; i++) {
            arrInt2[i] = arrInt[i + arrInt.length / 2];

        }

        for (int a :
                arrInt2) {
            System.out.println(a);
        }
    }
}

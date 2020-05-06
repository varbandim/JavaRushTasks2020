package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //строка результата
        String result = "";
        //ввод данных с клавиатуры
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());
        //проверка чисел на равенство и запись в строку результата
        if (a == b && a == c) {
            result = a + " " + b + " " + c;
            System.out.println(result);
        }
        else if(a == b) {
            result = a + " " + b;
            System.out.println(result);
        }
        else if(a == c) {
            result = a + " " + c;
            System.out.println(result);
        }
        else if(b == c) {
            result = b + " " + c;
            System.out.println(result);
        }


    }
}
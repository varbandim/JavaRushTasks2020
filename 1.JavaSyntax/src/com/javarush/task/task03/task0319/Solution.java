package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String name = buf.readLine();
        String  num1 = buf.readLine();
        String num2 = buf.readLine();
    
        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");
    }
}

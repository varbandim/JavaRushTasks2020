package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name1 = r.readLine();
        String name2 = r.readLine();

        if (name1.equals(name2)) System.out.println("Имена идентичны");
        if (!name1.equals(name2) && name1.length() == name2.length()) System.out.println("Длины имен равны");
    }
}

package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        reader.close();
        char[] chars = string.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        String str = new String(chars);
        System.out.println(str);
    }
}

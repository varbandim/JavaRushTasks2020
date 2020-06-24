package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String sentence = r.readLine();
        r.close();
        StringBuilder vowel = new StringBuilder();
        StringBuilder consonant = new StringBuilder();
        char[] strToArray = sentence.toCharArray();
        char n = 32;
        for (int i = 0; i < strToArray.length; i++) {
            if (isVowel(strToArray[i])) {
                vowel.append(strToArray[i]);
                vowel.append(" ");
            } else {
                if (strToArray[i] != n) {
                    consonant.append(strToArray[i]);
                    consonant.append(" ");
                }
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
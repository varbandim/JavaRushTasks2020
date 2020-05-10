package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<>();
        arr.add("мама");
        arr.add("мыла");
        arr.add("раму");
        String the = "именно";

        for (int i = 0; i < arr.size(); i++) {
            arr.add(i + 1, the);
            i++;
        }

        for (String a :
                arr) {
            System.out.println(a);
        }
    }
}

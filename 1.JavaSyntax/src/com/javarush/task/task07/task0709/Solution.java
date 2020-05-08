package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrStr = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            arrStr.add(r.readLine());
        }
        r.close();

        int min = arrStr.get(0).length();
        for (String a :
                arrStr) {
            if (a.length() < min) min = a.length();
        }

        for (String a :
                arrStr) {
            if (a.length() == min) {
                System.out.println(a);
            }
        }
    }
}

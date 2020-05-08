package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
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

        String tmp = "";
        for (int i = 0; i < 13; i++) {
            tmp = arrStr.get(arrStr.size()-1);
            arrStr.remove(arrStr.size() - 1);
            arrStr.add(0, tmp);
        }

        for (String a :
                arrStr) {
            System.out.println(a);
        }
    }
}

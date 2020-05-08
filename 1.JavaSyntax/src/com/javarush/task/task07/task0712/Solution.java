package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> arrStr = new ArrayList<>();
        BufferedReader r = new BufferedReader((new InputStreamReader(System.in)));
        int lengthShort = 999999;
        int lengthLong = 0;
        for (int i = 0; i < 10; i++) {
            arrStr.add(r.readLine());
            if (arrStr.get(i).length() < lengthShort) lengthShort = arrStr.get(i).length();
            if (arrStr.get(i).length() > lengthLong) lengthLong = arrStr.get(i).length();
        }
        r.close();
        for (int i = 0; i < arrStr.size() - 1; i++) {
            if (lengthShort == arrStr.get(i).length()) {System.out.println(arrStr.get(i));break;}
            else if (lengthLong == arrStr.get(i).length()) {System.out.println(arrStr.get(i));break;}
        }

    }
}

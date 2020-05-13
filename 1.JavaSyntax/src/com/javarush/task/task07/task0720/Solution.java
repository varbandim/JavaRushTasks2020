package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            arr.add(reader.readLine());
        }

        reader.close();

        String tmp = "";
        for (int i = 0; i < m; i++) {
            tmp = arr.get(0);
            arr.remove(0);
            arr.add(tmp);
        }

        for (String a :
                arr) {
            System.out.println(a);
        }
    }
}

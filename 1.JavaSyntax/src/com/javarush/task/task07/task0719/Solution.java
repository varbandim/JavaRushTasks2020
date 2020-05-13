package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();

        for (int i = arr.size() - 1; i >= 0 ; i--) {
            System.out.println(arr.get(i));
        }

        //напишите тут ваш код
    }
}

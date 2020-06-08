package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(Integer.parseInt(r.readLine()));
        }
        r.close();
        int max = 0;
        int count = 1;
        for (int i = 0; i < nums.size() - 1; i++) {
            if ((int)nums.get(i) == (int)nums.get(i+1)) count++;else count = 1;
            if (max < count) max = count;
        }

        System.out.println(max);
    }
}
package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            try {
                list.add(Integer.parseInt(r.readLine()));
            } catch (IOException e) {}
            catch (NumberFormatException e){
                for (Integer a :
                        list) {
                    System.out.println(a);
                }
                break;
            }
        }
    }
}

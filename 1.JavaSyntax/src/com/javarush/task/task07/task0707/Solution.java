package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<>();
        str.add("1111");
        str.add("2222");
        str.add("3333");
        str.add("4444");
        str.add("5555");

        System.out.println(str.size());
        for (String a :
                str) {
            System.out.println(a);
        }
    }
}

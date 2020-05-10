package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("мера");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        int indexR = -1;
        int indexL = -1;

        for (int i = 0; i < strings.size(); ) {
            indexR = strings.get(i).indexOf("р");
            indexL = strings.get(i).indexOf("л");
            if (indexR > -1 && indexL > -1) {
                i++;
                continue;
            } else if (indexR == -1 && indexL == -1) {
                i++;
                continue;
            } else if (indexR > -1 && indexL == -1) {
                strings.remove(i);
                indexR = -1;
                indexL = -1;
                continue;
            } else if (indexR == -1 && indexL > -1) {
                strings.add(i + 1, strings.get(i));
                indexR = -1;
                indexL = -1;
                i++;
                i++;
                continue;
            }
        }

        return strings;
    }
}
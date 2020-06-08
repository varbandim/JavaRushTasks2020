package com.javarush.task.task08.task0807;

/* 
LinkedList и ArrayList
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static Object createArrayList() {
        //напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        return arrayList;

    }

    public static Object createLinkedList() {
        //напишите тут ваш код
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }

    public static void main(String[] args) {

    }
}

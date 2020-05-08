package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> allList = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list6 = new ArrayList<>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int a = Integer.parseInt(r.readLine());
            allList.add(a);
            if (a % 3 == 0) list3.add(a);
            if (a % 2 == 0) list2.add(a);
            list6.add(a);
        }
        r.close();

        for (int j = 0; j < list2.size(); j++) {
        for (int i = 0; i < list6.size();) {

                if (list2.get(j) == list6.get(i)) list6.remove(i);
                else
                    i++;
            }
        }

        for (int j = 0; j < list3.size(); j++) {
        for (int i = 0; i < list6.size();) {

                if (list3.get(j) == list6.get(i)) list6.remove(i);
                else
                    i++;
            }
        }


        printList(list2);
        printList(list3);
        printList(list6);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int a :
                list) {
            System.out.println(a);
        }
    }
}

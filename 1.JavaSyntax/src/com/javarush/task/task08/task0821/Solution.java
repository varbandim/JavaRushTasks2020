package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov1", "Ivan1");
        map.put("Ivanov1", "Ivan2");
        map.put("Ivanov2", "Ivan3");
        map.put("Ivanov3", "Ivan1");
        map.put("Ivanov4", "Ivan2");
        map.put("Ivanov5", "Ivan3");
        map.put("Ivanov6", "Ivan1");
        map.put("Ivanov7", "Ivan2");
        map.put("Ivanov8", "Ivan3");
        map.put("Ivanov9", "Ivan1");
//        map.put("Ivanov10", "Ivan2");
//        map.put("Ivanov2", "Ivan3");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

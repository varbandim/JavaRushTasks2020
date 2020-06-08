package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Василий");
        map.put("Петров", "Петр");
        map.put("Соловьев", "Николай");
        map.put("Баранов", "Пересильд");
        map.put("Волькин", "Клаус");
        map.put("Дюжев", "Рекс");
        map.put("Несдюжев", "Иван");
        map.put("Рабинович", "Драхм");
        map.put("Коваль", "Лухр");
        map.put("Наглов", "Нежк");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> m :
                map.entrySet()) {
            if (m.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> m :
                map.entrySet()) {
            if (m.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}

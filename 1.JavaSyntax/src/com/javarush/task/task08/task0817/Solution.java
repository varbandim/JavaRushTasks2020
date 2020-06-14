package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Сталлоне", "Сильвестр");
        map.put("Пупкин", "Вася");
        map.put("Клаус", "Штефан");
        map.put("Колль", "Вася");
        map.put("Чиппероне", "Чипполино");
        map.put("Моракус", "Мундус");
        map.put("Стебль", "Конст");
        map.put("Тролль", "Вася");
        map.put("Кланс", "Тронс");
        map.put("Дропс", "Крон");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, Integer> mapValues = new HashMap<>();

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> pair = it.next();
            boolean flag = !mapValues.containsKey(pair.getValue());
            if (flag) {
                mapValues.put(pair.getValue(), 1);
            } else mapValues.put(pair.getValue(), mapValues.get(pair.getValue()) + 1);
        }

        for (Map.Entry<String, Integer> a :
                mapValues.entrySet()) {
            if (a.getValue() > 1) {
                removeItemFromMapByValue(map, a.getKey());
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> map = createMap();
//        removeTheFirstNameDuplicates(map);
//        for (Map.Entry<String, String> s:
//             map.entrySet()) {
//            System.out.println(s.getKey() + " " + s.getValue());
//        }
    }
}

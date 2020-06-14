package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Guss", 500);
        map.put("Gauss", 1500);
        map.put("Guass", 2500);
        map.put("Gusas", 300);
        map.put("Gussa", 400);
        map.put("Gduss", 500);
        map.put("Gudss", 600);
        map.put("Gusds", 700);
        map.put("Gfuss", 800);
        map.put("Gufss", 900);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = it.next();
            if (pair.getValue() < 500) {
                it.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
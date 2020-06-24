package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("Vasiliy", new Cat("Vasiliy"));
        cats.put("Pon", new Cat("Pon"));
        cats.put("Vas", new Cat("Vas"));
        cats.put("Vasi", new Cat("Vasi"));
        cats.put("Vasil", new Cat("Vasil"));
        cats.put("Vasili", new Cat("Vasili"));
        cats.put("asiliy", new Cat("asiliy"));
        cats.put("siliy", new Cat("siliy"));
        cats.put("iliy", new Cat("iliy"));
        cats.put("liy", new Cat("liy"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<>();
        for (Map.Entry<String, Cat> pair :
                map.entrySet()) {
            cats.add(pair.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

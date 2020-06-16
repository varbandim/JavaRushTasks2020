package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;
            map.put(city, family);
        }
        //System.out.println("Ввод города для поиска семьи:");
        String cityName = reader.readLine();

        for (Map.Entry<String, String> pair :
                map.entrySet()) {
            if (pair.getKey().equals(cityName)) {
                System.out.println(pair.getValue());
            }
        }

//        List<String> list = new ArrayList<>();
//        while (true) {
//            String city = reader.readLine();
//            String family = reader.readLine();
//            if (family.isEmpty() || city.isEmpty()) {
//                break;
//            }
//            list.add(city);
//            list.add(family);
//        }
//
//        // Read the house number
//        //int houseNumber = Integer.parseInt(reader.readLine());
//        String cityName = reader.readLine();
//
////        if (0 <= houseNumber && houseNumber < list.size()) {
////            String familyName = list.get(houseNumber);
////            System.out.println(familyName);
////        }
//        for (int i = 0; i < list.size() - 1; i++) {
//            if (list.get(i).equals(cityName)) {
//                System.out.println(list.get(i+1));
//            }
//        }

    }
}

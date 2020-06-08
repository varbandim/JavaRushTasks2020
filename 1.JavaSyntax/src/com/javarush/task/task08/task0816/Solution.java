package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Пупкин", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Клаус", dateFormat.parse("JANUARY 1 2012"));
        map.put("Колль", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Чиппероне", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Моракус", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Стебль", dateFormat.parse("AUGUST 1 2012"));
        map.put("Тролль", dateFormat.parse("JULY 1 2012"));
        map.put("Кланс", dateFormat.parse("JUNE 1 2012"));
        map.put("Дропс", dateFormat.parse("APRIL 1 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Date> pair = it.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7)
                it.remove();
        }
    }

    public static void main(String[] args) {

    }
}

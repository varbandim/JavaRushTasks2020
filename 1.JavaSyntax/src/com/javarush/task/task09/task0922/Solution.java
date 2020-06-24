package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String sDate = r.readLine();
        r.close();

//        String[] subStr;
//        String delimiter = "-";
//        subStr = sDate.split(delimiter);
//        int year = Integer.parseInt(subStr[0]);
//        int month = Integer.parseInt(subStr[1]);
//        int day = Integer.parseInt(subStr[2]);

        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(sDate);

        SimpleDateFormat df = new SimpleDateFormat("MMM dd, y", Locale.ENGLISH);
        System.out.println(df.format(date).toUpperCase());
    }
}

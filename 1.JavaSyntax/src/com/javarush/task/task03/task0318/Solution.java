package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String sAge = buf.readLine();
        String name = buf.readLine();
        System.out.println(name + " захватит мир через " + sAge + " лет. Му-ха-ха!");
    }
}

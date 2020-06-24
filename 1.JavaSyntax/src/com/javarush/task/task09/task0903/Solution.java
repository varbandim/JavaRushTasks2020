package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stack1 = Thread.currentThread().getStackTrace();
        int n1 = stack1[2].getLineNumber();
        return  /*напишите тут ваш код*/ n1;
    }

    public static int method2() {
        method3();
        StackTraceElement[] stack2 = Thread.currentThread().getStackTrace();
        int n2 = stack2[2].getLineNumber();
        return  /*напишите тут ваш код*/ n2;
    }

    public static int method3() {
        method4();
        StackTraceElement[] stack3 = Thread.currentThread().getStackTrace();
        int n3 = stack3[2].getLineNumber();
        return  /*напишите тут ваш код*/ n3;
    }

    public static int method4() {
        method5();
        StackTraceElement[] stack4 = Thread.currentThread().getStackTrace();
        int n4 = stack4[2].getLineNumber();
        return  /*напишите тут ваш код*/ n4;
    }

    public static int method5() {
        StackTraceElement[] stack5 = Thread.currentThread().getStackTrace();
        int n5 = stack5[2].getLineNumber();
        return  /*напишите тут ваш код*/ n5;
    }
}

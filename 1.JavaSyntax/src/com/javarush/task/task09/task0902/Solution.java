package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stack1 = Thread.currentThread().getStackTrace();
        String n1 = stack1[2].getMethodName();
        return n1;
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stack2 = Thread.currentThread().getStackTrace();
        String n2 = stack2[2].getMethodName();
        return n2;
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stack3 = Thread.currentThread().getStackTrace();
        String n3 = stack3[2].getMethodName();
        return n3;
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stack4 = Thread.currentThread().getStackTrace();
        String n4 = stack4[2].getMethodName();
        return n4;
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stack5 = Thread.currentThread().getStackTrace();
        String n5 = stack5[2].getMethodName();;
        return n5;
    }
}

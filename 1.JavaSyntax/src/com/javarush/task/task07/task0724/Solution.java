package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFa1 = new Human("Vasya", true, 85);
        Human grandFa2 = new Human("Vasya", true, 85);
        Human grandMa1 = new Human("Vasya", false, 85);
        Human grandMa2 = new Human("Vasya", false, 85);
        Human father = new Human("Vasya", true, 45, grandFa1, grandMa1);
        Human mother = new Human("Vasya", false, 44, grandFa2, grandMa2);
        Human son1 = new Human("Vasya", true, 44, father, mother);
        Human daut1 = new Human("Vasya", false, 44, father, mother);
        Human son2 = new Human("Vasya", true, 44, father, mother);

        System.out.println(grandFa1.toString());
        System.out.println(grandFa2.toString());
        System.out.println(grandMa1.toString());
        System.out.println(grandMa2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(daut1.toString());
        System.out.println(son2.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
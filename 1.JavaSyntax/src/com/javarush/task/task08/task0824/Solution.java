package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human();
        son1.name = "Vasiliy";
        son1.sex = true;
        son1.age = 15;

        Human son2 = new Human();
        son2.name = "Ivan";
        son2.sex = true;
        son2.age = 10;

        Human son3 = new Human();
        son3.name = "Petr";
        son3.sex = true;
        son3.age = 6;

        Human mother = new Human();
        mother.name = "Vasilisa";
        mother.sex = false;
        mother.age = 35;
        mother.children.add(son1);
        mother.children.add(son2);
        mother.children.add(son3);

        Human father = new Human();
        father.name = "Konstantin";
        father.sex = true;
        father.age = 39;
        father.children.add(son1);
        father.children.add(son2);
        father.children.add(son3);

        Human grandma1 = new Human();
        grandma1.name = "Uliana";
        grandma1.sex = false;
        grandma1.age = 65;
        grandma1.children.add(mother);

        Human grandma2 = new Human();
        grandma2.name = "Vasilina";
        grandma2.sex = false;
        grandma2.age = 65;
        grandma2.children.add(father);

        Human grandfa1 = new Human();
        grandfa1.name = "Alexey";
        grandfa1.sex = true;
        grandfa1.age = 69;
        grandfa1.children.add(mother);

        Human grandfa2 = new Human();
        grandfa2.name = "Alexandr";
        grandfa2.sex = true;
        grandfa2.age = 69;
        grandfa2.children.add(father);

        System.out.println(grandfa1.toString());
        System.out.println(grandfa2.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandma2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

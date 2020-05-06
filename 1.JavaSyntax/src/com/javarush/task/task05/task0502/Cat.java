package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int cat1Power = 0;
        int cat2Power = 0;
        if (this.age > anotherCat.age) {
            cat1Power++;
        } else if (this.age == anotherCat.age) {
            cat1Power++;
            cat2Power++;
        } else cat2Power++;
        if (this.strength > anotherCat.strength) {
            cat1Power++;
        } else if (this.strength == anotherCat.strength) {
            cat1Power++;
            cat2Power++;
        } else cat2Power++;
        if (this.weight > anotherCat.weight) {
            cat1Power++;
        } else if (this.weight == anotherCat.weight) {
            cat1Power++;
            cat2Power++;
        } else cat2Power++;

        return cat1Power > cat2Power;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.weight = 2;
        cat2.weight = 3;
        cat1.strength = 5;
        cat2.strength = 3;
        cat1.age = 5;
        cat2.age = 10;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}

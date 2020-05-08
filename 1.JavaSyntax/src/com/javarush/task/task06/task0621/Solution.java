package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfaName = reader.readLine();
        String grandmaName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String dautherName = reader.readLine();

        Cat catGrandfa = new Cat(grandfaName, null, null);
        Cat catGrandma = new Cat(grandmaName, null, null);
        Cat catFather = new Cat(fatherName, null, catGrandfa);
        Cat catMother = new Cat(motherName, catGrandma, null);
        Cat catSon = new Cat(sonName, catMother, catFather);
        Cat catDauther = new Cat(dautherName, catMother, catFather);

        System.out.println(catGrandfa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDauther);

//        String motherName = reader.readLine();
//        Cat catMother = new Cat(motherName);
//
//        String daughterName = reader.readLine();
//        Cat catDaughter = new Cat(daughterName, catMother);
//
//        System.out.println(catMother);
//        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;


//        Cat(String name) {
//            this.name = name;
//        }
//
//        Cat(String name, Cat parent) {
//            this.name = name;
//            this.parent = parent;
//        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
//            if (parent == null)
//                return "The cat's name is " + name + ", no mother ";
//            else
//                return "The cat's name is " + name + ", mother is " + parent.name;

            String m = mother!=null ? ", mother is " + mother.name : ", no mother";
            String f = father!=null ? ", father is " + father.name : ", no father";
            return "The cat's name is " + name + m + f;
        }
    }

}

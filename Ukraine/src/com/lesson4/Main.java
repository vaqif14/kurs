package com.lesson4;

public class Main {
    public static void main(String[] args) {
        Dog dogOne = new Dog("Bobik");
        Ball Ball = new Ball(12, "red");
        Cat cat = new Cat("Asya", 12, "rijiy");
        Cat cat2 = new Cat("ya", 12, "rijiy");
        Cat cat3 = new Cat("sya", 12, "rijiy");
        Cat cat4 = new Cat("Aa", 12, "rijiy");
        Cat [] cats = new  Cat[] {cat,cat2,cat3,cat4};
        for (Cat cat1:cats) {
            System.out.println(cat1);
        }
        Dog dog2 = new Dog("Belka");
        dogOne.Bite(dogOne);
        dogOne.Bite(Ball);
        dogOne.Bite(cat);
        dogOne.Bite(dog2);
    }
}

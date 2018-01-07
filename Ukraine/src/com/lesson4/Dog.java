package com.lesson4;

public class Dog implements Bite{
    private String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {

        this.name = name;
    }

    @Override
    public boolean isTasty() {
        return false;
    }
    public void Bite(Bite biteThink){
        if (biteThink==this){
            System.out.println("i bite myself");
            return;
        }
        System.out.println("i bite"+biteThink+"it is " + (biteThink.isTasty()?"Good":"Bad"));
    }

}

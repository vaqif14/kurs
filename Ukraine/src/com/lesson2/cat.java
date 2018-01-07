package com.lesson2;

public class cat extends Animal {
private String name;
private String type;

    public cat(int age, double weigth, boolean sex, String ration, String name, String type) {
        super(age, weigth, sex, ration);
        this.name = name;
        this.type = type;
//        System.out.println("Cat Create");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
public void getVoice(){
    System.out.println("Mya Myau");
}
    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                super.toString()+
                '}';
    }
}

package com.lesson2;

public class Animal {
    private int age;
    private double weigth;
    private boolean sex;
    private  String ration;

    public Animal(int age, double weigth, boolean sex, String ration) {
        super();
        this.age = age;
        this.weigth = weigth;
        this.sex = sex;
        this.ration = ration;
//        System.out.println("Animal Create");
    }
    public Animal(){
        super();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }
    public void getVoice(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weigth=" + weigth +
                ", sex=" + sex +
                ", ration='" + ration + '\'' +
                '}';
    }
}

package com.lesson1;

public class Car {
private String color;
private double weight;
private int year;
private double velocity = 0;

    public Car(String color, double weight, int year) {
        this.color = color;
        this.weight = weight;
        this.year = year;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public Car setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }

    public Car(){

}

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                ", velocity=" + velocity +
                '}';
    }
}

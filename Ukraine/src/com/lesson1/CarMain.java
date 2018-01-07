package com.lesson1;

public class CarMain {
    public static void main(String[] args){
    Car car = new Car("Green",1500,1994);
    Car car2 =new Car();
    car2.setYear(1995);
    car2.setColor("Blue");
    car2.setWeight(15000);
        System.out.println(car2);
    }
}

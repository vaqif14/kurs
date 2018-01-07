package com.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 2, 4, 6, 1};
        System.out.println(getElement(array, 2));
        System.out.println(getElement(array, 7));
    }

    public static int getElement(int[] array, int index) {
        int result = 0;
        try {
            result = array[index];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
        return result;
    }
}

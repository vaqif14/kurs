package ders3;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
   if(b<18)
    {
        System.out.println("Genc");
    }  if(b>=18&&b<=35)
    {
        System.out.println("Orta yashli");
    }
    {
        if (b >= 35 && b >= 55) {
            System.out.println("Yashli");
        } else {
            if (b >= 55 && b >=70) {
                System.out.println("Qoca");
            }
        }
    }
}}


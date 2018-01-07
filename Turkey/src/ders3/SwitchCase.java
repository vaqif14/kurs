package ders3;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int haftaSonu = a.nextInt();
        switch (haftaSonu) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thursday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sathurday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                default:
                    System.out.println("Haftasonu kaydet");
        }
    }
}


package com.lesson3;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {
        double a;
        for (; ; ) {
            try {
                a = Double.valueOf(JOptionPane.showInputDialog("Input double number"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error number format");
            }catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "Cancelled");
                a=5;
                break;
            }
        }
        System.out.println(a);
    }
}
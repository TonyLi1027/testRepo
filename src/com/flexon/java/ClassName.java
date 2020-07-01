package com.flexon.java;

import javax.swing.JOptionPane;

public class ClassName {
    public static void main(String[] args){
        System.out.println("hello world");
        String[] thisClass = new String[10];
        thisClass = new String[]{"Deep", "Dongshuo", "Shrina", "Abby", "Kun", "Oaz", "Jason", "Sam", "Richard", "Tao"};
        //Generate random value
        int rand = (int) (Math.random()*9);
        System.out.println(thisClass[rand]);
        JOptionPane.showMessageDialog(null, thisClass[rand]);

    }
}

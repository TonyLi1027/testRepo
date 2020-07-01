package com.flexon.java;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ClassName {
    public static void main(String[] args) throws IOException {
        System.out.println("hello world");
        String[] thisClass = new String[50];
        //thisClass = new String[]{"Deep", "Dongshuo", "Shrina", "Abby", "Kun", "Oaz", "Jason", "Sam", "Richard", "Tao"};
        int index_name = 0;
        String line;
        File inputFile = new File("com/flexon/java/Roaster.txt");

        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine())!=null){
            thisClass[index_name] = line;
            System.out.println(line);
            index_name++;
        }

        //String line = bufferedReader.readLine();


        //Generate random value
        int rand = (int) (Math.random()*thisClass.length);
        System.out.println(thisClass[rand]);
        JOptionPane.showMessageDialog(null, thisClass[rand]);

    }
}

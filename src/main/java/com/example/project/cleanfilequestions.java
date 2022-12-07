package com.example.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class cleanfilequestions {
    public static void cleanquestions(){
        try (FileWriter fw = new FileWriter("C:\\lab POO\\aloooo\\tema-1-Huntzera13-master\\src\\main\\java\\com\\example\\project\\questions.txt", false);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println("");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

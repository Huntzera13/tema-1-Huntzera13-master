package com.example.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class cleanuser {
//
    public static void cleanuser(){
        try (FileWriter fw = new FileWriter("C:\\lab POO\\aloooo\\tema-1-Huntzera13-master\\user.txt", false);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println("");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

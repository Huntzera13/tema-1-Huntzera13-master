package com.example.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class User {
//
    public static void verification (String[] args) {
        if (args.length == 1)
            System.out.println("{ 'status' : 'error', 'message' : 'Please provide username'}");
        else if (args.length == 2)
            System.out.println("{ 'status' : 'error', 'message' : 'Please provide password'}");
        else if (args.length == 3) {
            try (BufferedReader br = new BufferedReader(new FileReader(("C:\\lab POO\\aloooo\\tema-1-Huntzera13-master\\user.txt")))) {
                String line = br.readLine();
                int ok = 1;
                 while (line != null) {
                    if (args[1].equals(line)) {
                        ok = 0;
                        break; }
                        line = br.readLine();
                }
                 if (ok == 1){
                     System.out.println("{ 'status' : 'ok', 'message' : 'User created successfully'}");
                try (FileWriter fw = new FileWriter("user.txt", true);
                     BufferedWriter bw = new BufferedWriter(fw);
                     PrintWriter out = new PrintWriter(bw)) {

                    out.println(args[1]);
                } catch (IOException e) {
                    System.out.println("Error");
                }
                 }
                 else
                     System.out.println("{ 'status' : 'error', 'message' : 'User already exists'}");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
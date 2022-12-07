package com.example.project;

import java.io.*;
//
public class Questions {

    public static void verification_no_user_or_no_password(String[] args){
        if (args.length < 3)
            System.out.println("{ 'status' : 'error', 'message' : 'You need to be authenticated'}");
    }
}
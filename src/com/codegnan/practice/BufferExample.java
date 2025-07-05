package com.codegnan.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferExample  {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int Para=sc.read();
        char c=(char)Para;
        String s=new Scanner(System.in).next();
        System.out.println(s);
        System.out.println(c);
        System.out.println(Para);

    }
}

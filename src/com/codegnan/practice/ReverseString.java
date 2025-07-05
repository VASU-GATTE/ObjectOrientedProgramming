package com.codegnan.practice;

import java.util.Scanner;

public class ReverseString {
    public static String Reversal(String s){
        String reverse=" ";
        for (int i = 0; i < s.length(); i++) {
            reverse+=s.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String s=sc.nextLine();
        String reversed=" ";
        String[] s2=s.split(" ");
        for (int i = 0; i < s2.length-1; i++) {
            if(s2[i].length()<s2[i+1].length()) {
                System.out.print(Reversal(s2[i + 1]) + "\t");
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        reversed=sb.reverse().toString();
        System.out.println(reversed);
    }
}

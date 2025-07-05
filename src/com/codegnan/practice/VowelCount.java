package com.codegnan.practice;

import java.util.Scanner;

public class VowelCount {
    public int Vowels(String s){
        int count=0;
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        VowelCount obj=new VowelCount();
        String s=sc.nextLine();
        String[] s2=s.split(" ");
        for (int i = 0; i < s2.length; i++) {
            System.out.println("Word : " + s2[i] + "\t No.of Vowels : " + obj.Vowels(s2[i]));
        }

    }
}

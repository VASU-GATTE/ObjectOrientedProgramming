package com.codegnan.practice;

public class HollowTriangle {
    public static void main(String[] args) {
        int rows=10;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                if(j==1||i==rows-1||j==(2*i-1)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

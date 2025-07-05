package com.codegnan.practice;

public class PrimeNumberOnArray {
    int primeverify(int a){
        int count=0;
        if(a<=1) return 0;
        for (int i = 2; i <= (a*a); i++) {
            if(a%i==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PrimeNumberOnArray ob=new PrimeNumberOnArray();
        int[] a={3,5,2,67,13,81};
        for(int num:a) {
            if(ob.primeverify(num)<2) {
                System.out.println("Prime : "+num);
            }else{
                System.out.println("Not A Prime : "+num);
            }
        }
    }
}

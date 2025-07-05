package OOP;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static int[] Sort(int[] a){

        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Int array : \n");
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        int temp = 0;
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = 0; j < a.length - 1; j++) {
//                if (a[j] > a[j + 1]) {
//                    temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//    }
        Arrays.sort(a);
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}

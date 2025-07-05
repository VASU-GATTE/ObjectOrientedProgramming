package com.codegnan.practice;

public class FindMissingNumber {
            public static int findMissingNumber(int[] arr, int n,int min,int max) {
                int totalSum = n * (n + 1) / 2;
                int arraySum = 0;

                for (int i = min; i <= max ; i++) {
                    arraySum+=i;
                }

                for (int num : arr) {
                    totalSum += num;
                }

                return totalSum - arraySum;
            }

            public static void main(String[] args) {
                int[] arr = {7,8,10,11};
                int max=arr.length;// Missing number is 3
                int n = arr[max-1];  // Numbers should be from 1 to 6

                int missing = findMissingNumber(arr, n,arr[0],arr[max-1]);
                System.out.println("Missing number is: " + missing);
            }
}

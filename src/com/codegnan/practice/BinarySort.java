package com.codegnan.practice;

public class BinarySort {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,2,1,44,1};
        int target=77;
        int result=binarySearch(nums,target);
        if(result==-1){
            System.out.println("Not Found....");
        }else{
            System.out.println("Element Found at Index : "+result);
        }
    }
    public static int binarySearch(int[] a,int target){
        int min=0;
        int max=a.length-1;

        while(min<=max){
            int mid=(min+max)/2;

            if(a[mid]==target){
                return mid;
            }
            else{
                if(a[mid]<target){
                    min=mid+1;
                }else{
                    max=mid-1;
                }
            }
        }
        return -1;
    }
}

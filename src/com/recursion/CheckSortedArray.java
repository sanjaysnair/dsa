package com.recursion;

public class CheckSortedArray {
    public static boolean check(int[] arr){
        if (arr.length==1){
            return true;
        }
        if (arr[0]>arr[1]){
            return false;
        }
        int[] smallArray = new int[arr.length-1];
        for (int i=1;i<arr.length;i++){
            smallArray[i-1]=arr[i];
        }
        return check(smallArray);
    }
    public static void main(String[] args) {
        int[] arr={5,6,9,8,10};
        System.out.println(check(arr));
    }
}

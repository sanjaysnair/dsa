package com.timecomplexity;

public class ArrayEquillibriumIndex {
    public static int arrayEquilibriumIndex(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int s1 = arr[0];
        int s2 = sum(arr, 2);
        for (int i=1;i<arr.length;i++){
            if (i!=1){
                s1 = s1 + arr[i-1];
                s2 = s2 - arr[i];
            }
            if (s1==s2){
                return i;
            }
        }
        return -1;
    }
    public static int sum(int[] arr, int startIndex){
        if (arr.length==0 || startIndex>arr.length-1){
            return 0;
        }
        return arr[startIndex] + sum(arr,startIndex+1);
    }

    public static void main(String[] args) {
        int[] a = {6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0};
        System.out.println(arrayEquilibriumIndex(a));;
    }
}

package com.timecomplexity.assignment;

public class ArrayRotate {
    public static void rotate(int[] arr, int d) {
        for (int i=0;i<d;i++){
            int temp=arr[0];
            for (int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
    }

    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5, 6, 7};
        rotate(a, 2);
    }
}

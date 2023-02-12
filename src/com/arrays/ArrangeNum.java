package com.arrays;

public class ArrangeNum {

    public static void print(int[] arr) {
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void arrange(int[] arr, int n) {
        int s = 0, e = arr.length-1;
        int sw = 0;
        for (int i=1;i<=n;i++) {
            if (sw==0) {
                arr[s] = i;
                s++;
                sw = 1;
            } else {
                arr[e] = i;
                e--;
                sw = 0;
            }
        }
        print(arr);
    }

    public static void main(String[] args) {
        int[] arr = new int[9];
        arrange(arr, 9);
    }
}

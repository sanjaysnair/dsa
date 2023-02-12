package com.recursion2;

import java.util.Scanner;

public class MergeSort {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int input[]) {
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        MergeSort.mergeSort(input);
        printArray(input);
    }
    public static void mergeSort(int[] input){
        // recursion base case
        if (input.length==1){
            return;
        }

        int mid = (0 + input.length-1) / 2;

        int si=0;
        int ei=input.length-1;
        int[] a1=new int[mid-si+1];
        int[] a2=new int[ei-1-mid+1];
        int p1=0, p2=0;
        for (int i=si;i<=mid;i++){
            a1[p1]=input[i];
            p1++;
        }
        for (int i=mid+1;i<=ei;i++){
            a2[p2]=input[i];
            p2++;
        }
        mergeSort(a1);
        mergeSort(a2);

        // merge back
        int[] a3 = merge(a1, a2);
        for (int i=0;i<input.length;i++){
            input[i]=a3[i];
        }
    }

    public static int[] merge(int[] a1, int[] a2){
        int[] arr = new int[a1.length+a2.length];
        int p1=0, p2=0, p3=0;
        while (p1<a1.length && p2<a2.length){
            if (a1[p1]<=a2[p2]){
                arr[p3]=a1[p1];
                p1++;
            } else {
                arr[p3]=a2[p2];
                p2++;
            }
            p3++;
        }
        if (p1==a1.length && p2<a2.length){
            for (int i=p2;i<a2.length;i++){
                arr[p3]=a2[i];
                p3++;
            }
        } else if (p2==a2.length && p1<a1.length){
            for (int i=p1;i< a1.length;i++){
                arr[p3]=a1[i];
                p3++;
            }
        }
        return arr;
    }
}

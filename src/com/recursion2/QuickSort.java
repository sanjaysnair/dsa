package com.recursion2;

import java.util.Random;

public class QuickSort {
    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length-1);
    }
    public static void quickSort(int[] input, int p, int q) {
        if (p < q){
            int c = partition(input, p, q);
            //System.out.println(input[c]);
            quickSort(input, p, c-1);
            quickSort(input, c+1, q);
        }
    }
    public static void swap(int[] a, int i, int j){
        int temp=a[j];
        a[j]=a[i];
        a[i]=temp;
    }
    public static int partition(int[] arr, int start, int end) {
        int pIndex = new Random().nextInt(end - start) + start;
        int pivot = arr[pIndex];
        swap(arr, pIndex, end);
        pIndex=end;
        while (start < end) {
            while (arr[start] <= pivot && start < end) {
                start++;
            }
            while (arr[end] >= pivot && start < end) {
                end--;
            }
            swap(arr, start, end);
        }
        swap(arr, start, pIndex);
        return start;
    }
    public static void main(String[] args) {
        int[] input = {1138, 3340, 442, 3752, 2639, 4312, 1, 3525, 223};
        QuickSort.quickSort(input);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}

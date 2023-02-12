package com.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SelectionSort {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void selectionSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++) {
            for (int j = i+1;j<arr.length;j++) {
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        String[] strNums;
        strNums = br.readLine().split("\\s");
        for (int i=0;i<size;i++) {
            arr[i] = Integer.parseInt(strNums[i]);
        }
        selectionSort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

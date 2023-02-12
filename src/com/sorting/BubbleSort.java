package com.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void bubbleSort(int[] arr) {
        for (int i=1;i<=arr.length;i++) {
            for (int j = 0;j<arr.length-i;j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
        bubbleSort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

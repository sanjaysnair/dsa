package com.sorting;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void insertionSort(int[] arr) {
        for (int i=1;i<arr.length;i++) {
            int temp = arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
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
        insertionSort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

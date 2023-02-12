package com.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RotateArray {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void rotate(int[] arr, int d) {
        int i = 0;
        while (i < d) {
            int j = 0;
            int temp = arr[0];

            while (j<arr.length-1) {
                arr[j]=arr[j+1];
                j++;
            }
            arr[arr.length-1]=temp;
            i++;
        }
    }
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int[] arr=new int[size];
        String[] strNums = br.readLine().split("\\s");
        for (int i=0;i<strNums.length;i++) {
            arr[i] = Integer.parseInt(strNums[i]);
        }
        int shift = Integer.parseInt(br.readLine());
        rotate(arr, shift);
        for (int j=0;j<arr.length;j++) {
            System.out.print(arr[j]+" ");
        }
    }
}

package com.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArray3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void rotate(int[] arr, int d) {
        // reverse
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // reverse 0-(end-d) elements
        int i2 = 0;
        int j2 = arr.length-d-1;
        while (i2 < j2) {
            int temp2 = arr[i2];
            arr[i2] = arr[j2];
            arr[j2] = temp2;
            i2++;
            j2--;
        }

        // reverse last 2 elements
        int i3 = arr.length-d;
        int j3 = arr.length-1;
        while (i3 < j3) {
            int temp3 = arr[i3];
            arr[i3] = arr[j3];
            arr[j3] = temp3;
            i3++;
            j3--;
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

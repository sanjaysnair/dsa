package com.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SortZeroOne {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void print(int[] arr) {
        for (int i=0;i < arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine());
        int[] input = new int[size];

        if (size==0) {
            return input;
        }
        String[] strNums;
        strNums = br.readLine().split("\\s");

        for (int i=0;i<size;i++) {
            input[i]=Integer.parseInt(strNums[i]);
        }
        return input;
    }

    public static void sortZeroesAndOne(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            if (arr[start]==0) {
                start++;
            }
            if (arr[end]==1) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine());
        int cnt=0;
        while (t > 0) {
            int[] input = takeInput();
            sortZeroesAndOne(input);
            print(input);
            t-=1;
            cnt++;
        }
    }
}

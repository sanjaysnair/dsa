package com.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestInArray2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int secondLargestElement(int[] arr) {
        if (arr.length==0) {
            return Integer.MIN_VALUE;
        }
        // find if all elements are equal
        int sum = arr[0]*arr.length;
        int calSum = 0;
        for (int k=0;k<arr.length;k++) {
            calSum += arr[k];
        }
        if (sum==calSum) {
            return Integer.MIN_VALUE;
        }

        // find second largest
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int i = 0;
        while (i<arr.length) {
            int temp = largest;
            if (arr[i]>largest) {
                largest = arr[i];
                secondLargest = temp;

            } else if (arr[i]>secondLargest && arr[i]!=largest) {
                secondLargest = arr[i];
            }
            i++;
        }
        return secondLargest;
    }
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        String[] strNums = br.readLine().split("\\s");
        for (int i=0;i<strNums.length;i++) {
            arr[i] = Integer.parseInt(strNums[i]);
        }
        int ans = secondLargestElement(arr);
        System.out.println(ans);
    }
}

package com.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SecondLargestInArray {
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

        // find largest
        int min = Integer.MIN_VALUE;
        int max = min;
        int maxPos = -1;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPos = i;
            }
        }

        //find second largest
        // diff between max and element should be minimum
        int i = 0;
        int secondMax = min;
        int minDiff = Integer.MAX_VALUE;
        while (i<arr.length) {
            int diff = max - arr[i];
            //System.out.println("max="+max+", arr[i]="+arr[i]+", diff="+diff);
            if (diff!=0 && diff < minDiff) {
                secondMax = arr[i];
                minDiff = diff;
                //System.out.println("\tsecondMax="+secondMax+", minDiff="+minDiff);
            }
            i++;

            if (i==maxPos) {
                i++;
            }
            if (i==arr.length) {
                break;
            }
        }
        return secondMax;
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

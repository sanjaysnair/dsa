package com.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* You have been given an integer array/list(ARR) of size N.
* It has been sorted(in increasing order) and then rotated
* by some number 'K' in the right hand direction.
Your task is to write a function that returns the value of 'K',
* that means, the index from which the array/list has been rotated.
* */
public class CheckArrayRotation2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int arrayRotateCheck(int[] arr){
        int cnt=0;
        boolean rotated=false;
        int i=0;
        while (i<arr.length-1) {
            if (arr[i]>arr[i+1]) {
                ++cnt;
                rotated=true;
                break;
            }
            ++cnt;
            i++;
        }
        if (rotated) {
            return cnt;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        String[] strNums = br.readLine().split("\\s");
        for (int i=0;i<strNums.length;i++) {
            arr[i] = Integer.parseInt(strNums[i]);
        }
        int ans = arrayRotateCheck(arr);
        System.out.println(ans);
    }
}

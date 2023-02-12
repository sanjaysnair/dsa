package com.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckArrayRotation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int arrayRotateCheck(int[] arr){
        int cnt=0;
        int i=0;
        while (i<arr.length-1) {
            if (arr[i]>arr[i+1]) {
                break;
            }
            cnt++;
            i++;
        }
        if (cnt+1==arr.length) {
            return 0;
        } else {
            return cnt + 1;
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

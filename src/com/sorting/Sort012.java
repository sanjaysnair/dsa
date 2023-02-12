package com.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void sort2(int[] arr) {
        int lo = 0;
        int n=arr.length;
        int hi = n-1;
        int mid = 0, temp=0;
        while (mid <= hi){
            switch (arr[mid]){
                case 0: {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:{
                    temp = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }
    public static void sort012(int[] arr){
        int i=0;
        int nz=0;
        int nt=arr.length-1;
        while (i<arr.length && i<=nt){
            if(arr[i]==1){
                i++;
                continue;
            }
            if (arr[i]==0){
                int temp=arr[nz];
                arr[nz]=arr[i];
                arr[i]=temp;
                i++;nz++;

            } else if (arr[i]==2){
                int temp=arr[nt];
                arr[nt]=arr[i];
                arr[i]=temp;
                nt--;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        String[] strNums = br.readLine().split("\\s");
        for (int i=0;i<strNums.length;i++) {
            arr[i] = Integer.parseInt(strNums[i]);
        }
        sort012(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

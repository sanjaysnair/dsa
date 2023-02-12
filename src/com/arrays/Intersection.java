package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intersection {
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
    public static void findIntersection(int[] arr1, int[] arr2) {
        int[] common = new int[arr1.length];
        for (int i=0;i<common.length;i++) {
            common[i] = -1;
        }
        int cnt = 0;
        for (int i=0;i<arr1.length;i++) {
            for (int j=0;j<arr2.length;j++) {
                if (arr1[i]==arr2[j]) {
                    common[cnt] = arr1[i];
                    arr2[j] = Integer.MIN_VALUE;
                    cnt++;
                    break;
                }
            }
        }
        for (int i=0;i<common.length;i++) {
            if (common[i]==-1) {
                break;
            }
            System.out.print(common[i]+" ");
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException  {
        int t = Integer.parseInt(br.readLine());
        int cnt=0;
        while (t > 0) {
            int[] input = takeInput();
            int[] input2 = takeInput();
            findIntersection(input, input2);
            System.out.println();
            t-=1;
            cnt++;
        }

    }
}

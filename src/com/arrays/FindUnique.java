package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindUnique {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void print(int[] arr) {
        for (int i=0;i < arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int findUnique(int[] arr){
        int[] parsed = new int[arr.length];
        for (int i=0;i<arr.length;i++) {

            boolean isParsed = false;
            for (int k=0;k<parsed.length;k++) {
                if (parsed[k]==arr[i]) {
                    isParsed=true;
                }
            }
            if (isParsed) {
                continue;
            }
            boolean hasDuplicate = false;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i]==arr[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate == false) {
                return arr[i];
            }
            parsed[i] = arr[i];
        }
        return -1;
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

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine());
        int[] unique = new int[t];
        int cnt=0;
        while (t > 0) {
            int[] input = takeInput();
            unique[cnt] = findUnique(input);
            t-=1;
            cnt++;
        }
        if (unique.length > 0) {
            for (int i=0;i<unique.length;i++) {
                System.out.println(unique[i]);
            }
        }
    }
}

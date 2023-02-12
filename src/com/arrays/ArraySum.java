package com.arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
        for (int i=0;i<t; i++){
            int n = sc.nextInt();
            int sum = 0;
            for (int j=0;j<n;j++) {
                sum += sc.nextInt();
            }
            ans[i] = sum;
        }
        for (int i=0;i<t;i++) {
            System.out.println(ans[i]);
        }
    }
}

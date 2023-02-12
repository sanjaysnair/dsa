package com.test.pgm;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1 || n ==2) {
            System.out.println(1);
            return;
        }
        int i = 1;
        int j = 1;
        int k = 0;
        for (int c=2;c<n;c++) {
            k = i + j;
            i = j;
            j = k;
        }
        System.out.println(k);
    }
}

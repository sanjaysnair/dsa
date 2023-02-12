package com.test.pgm;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            int j = 1;
            while (j <= n-i) {
                System.out.print(n-i);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

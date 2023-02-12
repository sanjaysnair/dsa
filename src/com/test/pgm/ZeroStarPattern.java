package com.test.pgm;

import java.util.Scanner;

public class ZeroStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {

            int j = 1;
            while (j <= n) {
                if (i==j) {
                    System.out.print('*');
                } else {
                    System.out.print('0');
                }
                j++;
            }
            System.out.print('*');
            int k = 1;
            int l = n-i+1;
            while (k <= n) {
                if (k==l) {
                    System.out.print('*');
                } else {
                    System.out.print('0');
                }
                k++;
            }

            i++;
            System.out.println();
        }
    }
}

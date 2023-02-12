package com.test.pgm;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {

            int spaces = 1;
            while (spaces <= n-i) {
                System.out.print(' ');
                spaces++;
            }

            int j = i;
            while (j <= n-spaces+i) {
                System.out.print(j);
                j++;
            }

            int k = j-2;
            while (k > n-spaces) {
                System.out.print(k);
                k--;
            }
            i++;
            System.out.println();
        }
    }
}

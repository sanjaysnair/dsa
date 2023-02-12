package com.test.pgm;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int k = 0;
            while (k<i-1) {
                System.out.print(' ');
                k++;
            }
            int j = 1;
            while (j <= n) {

                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

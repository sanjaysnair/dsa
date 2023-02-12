package com.test.pgm;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        int i2 = 1;
        while (i > 0) {

            int j = 1;
            char p = (char)('A' + i - 1);
            while (j <= i2) {

                System.out.print(p);
                p = (char) (p+1);
                j++;
            }
            i--;
            i2++;
            System.out.println();
        }
    }
}

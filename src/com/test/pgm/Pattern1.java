package com.test.pgm;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {

            int j = 1;
            char p = (char)('A' + i - 1);
            while (j <= i) {

                System.out.print(p);
                p = (char) (p+1);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

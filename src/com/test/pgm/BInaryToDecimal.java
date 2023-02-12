package com.test.pgm;

import java.util.Scanner;

public class BInaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        int pv = 1;
        while (n > 0) {
            int rem = n % 10;
            if (i != 0) {
                pv = 2 * pv;
            }
            sum = sum + (rem * pv);
            i++;
            n = n/10;
        }
        System.out.println(sum);
    }
}

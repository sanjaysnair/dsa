package com.test.pgm;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 2;
        while (i <= n) {
            boolean isPrime = true;
            for (int j = 2;j < i;j++) {
                if (i%j==0 && i!=j) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
            i++;
        }
    }
}

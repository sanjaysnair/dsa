package com.test.pgm;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;

        int len = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            len++;
        }

        double s = 0;
        while (n > 0) {
            int r = n % 10;
            s = s + Math.pow(r, len);
            n = n / 10;
        }
        System.out.println((int)s==t);
    }
}

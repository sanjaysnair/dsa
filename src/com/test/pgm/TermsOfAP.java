package com.test.pgm;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int cnt = 1;
        while (cnt <= n) {
            int ap = (3*i) + 2;
            if (ap%4!=0) {
                System.out.print(ap+" ");
                cnt++;
            }
            i++;
        }
    }
}

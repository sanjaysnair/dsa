package com.functions;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int j = 1;

        if (n==1) {
            System.out.println("true");
            return;
        }
        do {
            int next = i + j;
            if (next==n) {
                System.out.println("true");
                return;
            }
            i = j;
            j = next;
        } while (j <= n);

        System.out.println("false");

    }
}

package com.test.pgm;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int i =1;
        if (c==1) {
            int result = 0;
            while (i <= n) {
                result += i;
                i++;
            }
            System.out.println(result);
        } else if (c==2) {
            int result = 1;
            while (i <= n) {
                result *= i;
                i++;
            }
            System.out.println(result);
        } else {
            System.out.println(-1);
        }


    }
}

package com.test.pgm;

import java.util.Scanner;

public class NumStarPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i<= n) {
            int j = n;
            while (j > 0) {
                if (j==i) {
                    System.out.print('*');
                } else {
                    System.out.print(j);
                }
                j--;

            }
            System.out.println();
            i++;
        }
    }
}

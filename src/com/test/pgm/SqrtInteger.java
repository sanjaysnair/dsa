package com.test.pgm;

import java.util.Scanner;

public class SqrtInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double temp;
        double sqrt = n/2;

        do {
            temp = sqrt;
            sqrt = (temp+(n/temp))/2;
        } while(temp-sqrt!=0);
        System.out.println((int)sqrt);
    }
}

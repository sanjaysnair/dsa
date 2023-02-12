package com.test.pgm;

import java.util.Scanner;
import java.lang.Math;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 1;
        int result = 1;
        while (cnt <= n) {
            result *= x;
            cnt++;
        }
        System.out.print(result);
    }
}

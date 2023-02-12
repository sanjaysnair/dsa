package com.recursion;

import java.util.Scanner;

public class Power {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(Power.power(x, n));
    }
    public static int power(int x, int n) {
        if (n==0){
            return 1;
        }
        int result = x * power(x, n-1);
        return  result;
    }
}

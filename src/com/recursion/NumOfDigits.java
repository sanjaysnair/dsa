package com.recursion;

import java.util.Scanner;

public class NumOfDigits {
    public static int count(int n){
        if (n==0){
            return 0;
        }
        int result = count(n/10);
        return result+1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
    }
}

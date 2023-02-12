package com.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int print(int n){
        //1,1,2,3,5,8,13,21
        if (n==1 || n==2){
            return 1;
        }
        int result = print(n-1) + print(n-2);
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Fibonacci num as pos."+n+" is : "+print(n));
    }
}

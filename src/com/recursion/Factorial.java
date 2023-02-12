package com.recursion;

public class Factorial {
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        int smallOutput = fact(n-1);
        return n*smallOutput;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}

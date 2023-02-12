package com.recursion2.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
* Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
using recursion.
* */
public class GeometricSum {
    public static double findGeometricSum(int k){
        if (k==0){
            return 1;
        }
        return (1/power(2, k))+findGeometricSum(k-1);
    }
    public static double power(int base, int exponent){
        if (exponent==1){
            return base;
        }
        return base*power(base, exponent-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        double ans = GeometricSum.findGeometricSum(k);
        DecimalFormat dec = new DecimalFormat("#0.00000");
        System.out.println(dec.format(ans));
    }
}

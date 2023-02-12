package com.test.pgm;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans=0, pv=1;
        int i=0;
        while (n > 0) {
            int rem = n%2;
            if (i!=0) {
                pv = pv * 10;
            }
            ans += rem*pv;
            //System.out.println("rem="+rem+", pv="+pv+", ans="+ans);
            n = n/2;
            i++;
        }
        System.out.println(ans);

    }
}

package com.test.pgm;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int cnt = 1;
        int last=0;
        while (cnt <= n) {
            int j = i;
            int cnt2=1;
            while (cnt2<=n){
                System.out.print(j);
                if (j == last){
                    j=1;
                } else {
                    j += 2;
                }
                cnt2++;
            }
            if (i==1) {
                last = j-2;
            }
            i+=2;
            cnt++;
            System.out.println();
        }
    }
}

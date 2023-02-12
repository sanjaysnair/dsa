package com.test.pgm;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean c = false;
        while (n > 0) {
            int rem = n%10;
            if (rem > 0 && c==false) {
                c = true;
            }
            if (c == true) {
                System.out.print(rem);
            }
            n = n/10;
        }
    }
}

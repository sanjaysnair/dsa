package com.test.pgm;

import java.util.Scanner;

public class CheckNumSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev=0, curr = 0;
        int track = 0;
        char curSeq='-';

        for (int i=0;i<n; i++) {

            if (prev==0 && curr==0) {
                curr = sc.nextInt();
                continue;
            } else {
                prev = curr;
                curr = sc.nextInt();
            }


            if (prev > curr) {//decr
                if (curSeq=='A') {
                    track++;
                }
                curSeq = 'D';
            } else if (curr > prev) {//incr
                if (curSeq=='D') {
                    track++;
                }
                curSeq = 'A';
            } else if (curr == prev) {
                System.out.println("false");
                return;
            }

            if (track>1) {
                System.out.println("false");
                return;
            }

        }
        System.out.println("true");
    }
}

package com.test.pgm;

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        int j = 1;
        int cnt = 1;
        String order = "asc";
        System.out.println("*");
        while (j<in*2){
            if (cnt==1){
                System.out.println("*1*");
            } else {
                System.out.print("*");
                int i = 1;
                while (i<cnt){
                    System.out.print(i);
                    i++;
                }
                while (i>=1){
                    System.out.print(i);
                    i--;
                }
                System.out.print("*");
                System.out.println();
            }
            if (cnt==in){
                order="desc";
            }
            if (order=="asc"){
                cnt++;
            } else {
                cnt--;
            }
            j++;
        }
        System.out.println("*");
    }
}

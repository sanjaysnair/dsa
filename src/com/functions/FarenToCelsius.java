package com.functions;

import java.util.Scanner;

public class FarenToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();

        for (int i=s;i <= e; i+=w) {
            int r = ((i-32)*5)/9;
            System.out.println(i+" "+r);
        }
    }
}

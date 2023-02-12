package com.recursion2.assignment;

import java.util.Scanner;

public class Staircase {
    public static int staircase(int n){
        if (n<1){
            return 1;
        }
        int x=staircase(n-1);
        int y=staircase(n-2);
        int z=staircase(n-3);
        return x+y+z;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Staircase.staircase(n));
    }
}

package com.test.pgm;

public class Precedence2 {
    public static void main (String[] args) {
        int a=10;
        a+=++a-5/3+6*a;
        System.out.print(a);
    }
}

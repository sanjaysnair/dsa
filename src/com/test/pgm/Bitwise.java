package com.test.pgm;

public class Bitwise {
    public static void main(String[] args) {
        int a=10,b=20;
        int c=a&b;
        System.out.print(c);
        int d=a|b;
        System.out.print(d);
        int e=a^b;
        System.out.print(e);
        int f=c+d+e;
        System.out.print(~f);

        int a2=10,b2=-20;
        System.out.print(a2^b2);
    }
}

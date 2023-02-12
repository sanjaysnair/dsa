package com.test.pgm;

public class Operator {
    public static void main(String[] args) {
        int a=5;
        a+=5+(++a)+(a++);
        System.out.print(a);
    }
}

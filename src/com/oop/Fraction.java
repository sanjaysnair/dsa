package com.oop;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }
    private void simplify(){
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i=smaller;i>=2;i--){
            if (numerator%i==0 && denominator%i==0){
                gcd=i;
                break;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }
    public void increment(){
        numerator=numerator+denominator;
        simplify();
    }
    public void print(){
        System.out.println(numerator+"/"+denominator);
    }
}

package com.oop;

public class ComplexNumbers {
    int real;
    int imaginary;
    public ComplexNumbers(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void plus(ComplexNumbers n){
        this.real += n.real;
        this.imaginary += n.imaginary;
    }
    public void multiply(ComplexNumbers n){
        int oldReal1 = this.real;
        int oldImg1 = this.imaginary;
        this.real = (this.real*n.real) - (this.imaginary*n.imaginary);
        this.imaginary = (oldReal1*n.imaginary) + (oldImg1*n.real);
    }
    public void print(){
        System.out.println(real+" + i"+imaginary);
    }
}

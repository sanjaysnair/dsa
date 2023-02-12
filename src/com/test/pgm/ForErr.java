package com.test.pgm;

public class ForErr {
    public static void main(String[] args) {
        for(int i=1;;i++)
        {   if(i>5)
        {
            break;
            //System.out.print("break statement reached");
        }
            System.out.print(i);
        }
    }
}

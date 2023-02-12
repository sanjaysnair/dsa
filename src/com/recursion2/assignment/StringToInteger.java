package com.recursion2.assignment;

import java.util.Scanner;

public class StringToInteger {
    public static int convertStringToInt(String input){
        if (input.length()==0){
            return 0;
        }
        int b = input.charAt(0);
        b = b - 48;
        b = b * pow(10, input.length()-1);
        return b + convertStringToInt(input.substring(1));
    }
    public static int pow(int base, int exp){
        if (exp==0){
            return 1;
        }
        return base * pow(base, exp - 1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(StringToInteger.convertStringToInt(input));
    }
}

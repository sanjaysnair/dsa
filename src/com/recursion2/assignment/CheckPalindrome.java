package com.recursion2.assignment;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isStringPalindrome(String input) {

        if (input.length()==0){
            return true;
        }
        if (input.length()==1){
            return true;
        }
        int i=0;
        int j=input.length()-1;
        if (Character.compare(input.charAt(i), input.charAt(j))!=0){
            return false;
        }
        return isStringPalindrome(input, i+1, j-1);
    }
    public static boolean isStringPalindrome(String input, int i, int j) {
        if (i>j){
            return true;
        }
        if (Character.compare(input.charAt(i), input.charAt(j))!=0){
            return false;
        }
        return isStringPalindrome(input, i+1, j-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(CheckPalindrome.isStringPalindrome(input));
    }
}

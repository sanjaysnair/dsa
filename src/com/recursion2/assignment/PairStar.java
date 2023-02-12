package com.recursion2.assignment;

import java.util.Scanner;

public class PairStar {
    public static String addStars(String s) {
        if (s.length()<=1){
            return s;
        }
        String newStr = "";
        if (s.charAt(0)==s.charAt(1)){
            newStr = s.charAt(0) + "*";
            return newStr + addStars(s.substring(1));
        }
        newStr = String.valueOf(s.charAt(0));
        return newStr + addStars(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(PairStar.addStars(input));
    }
}

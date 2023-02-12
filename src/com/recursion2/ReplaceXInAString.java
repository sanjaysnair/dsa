package com.recursion2;

import java.util.Scanner;

public class ReplaceXInAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(ReplaceXInAString.removeX(input));
    }
    public static String removeX(String input){
        if (input.length()==0){
            return "";
        }
        char current = input.charAt(0);
        if (current=='x'){
            return "" + removeX(input.substring(1));
        }
        return current + removeX(input.substring(1));
    }
}

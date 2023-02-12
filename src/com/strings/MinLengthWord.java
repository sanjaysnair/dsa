package com.strings;

import java.util.Scanner;

public class MinLengthWord {
    public static String minLengthWord(String input){
        int minLength=Integer.MAX_VALUE;
        String minStr = "";
        String[] str=input.split("\\s");
        for (int i=0;i<str.length;i++){
            char[] s = str[i].toCharArray();
            if (s.length<minLength){
                minStr=str[i];
                minLength=s.length;
            }
        }
        return minStr;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(MinLengthWord.minLengthWord(str));
    }
}

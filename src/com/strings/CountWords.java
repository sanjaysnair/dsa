package com.strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        String str = "";
        int cnt=0;

        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
                cnt++;
            }
        }
        System.out.print(cnt+1);
    }
}

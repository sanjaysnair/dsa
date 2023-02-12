package com.strings;

public class CheckPermutation2 {
    public static boolean isPermutation(String str1, String str2) {
        int[] freq = new int[123];
        for (int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            freq[(int)ch] += 1;
        }
        int[] freq2 = new int[123];
        for (int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            freq2[(int)ch] += 1;
        }
        for (int i=97;i<123;i++){
            if (freq[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="sinrtg";
        String str2="string";
        System.out.println(isPermutation(str1, str2));
    }
}

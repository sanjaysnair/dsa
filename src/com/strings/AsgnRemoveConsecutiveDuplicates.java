package com.strings;

public class AsgnRemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        if (str.length()<=1) {
            return str;
        }
        String ans = "";
        char prev = ' ';
        for (int i=0;i<str.length();i++){
            if ((int)str.charAt(i)<97 || (int)str.charAt(i)>122) {
                continue;
            }
            if (ans==""){
                ans += str.charAt(i);
                prev = str.charAt(i);
                continue;
            }
            if (str.charAt(i)==prev){
                continue;
            }
            ans += str.charAt(i);
            prev = str.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aadddgghhhha";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}

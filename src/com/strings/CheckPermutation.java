package com.strings;

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
        if (str1.length()==0 && str2.length()==0){
            return false;
        }
        int s1=0;
        for (int i=0;i<str1.length();i++){
            s1+= str1.charAt(i);
        }
        int s2=0;
        for (int i=0;i<str2.length();i++){
            s2+= str2.charAt(i);
        }
        System.out.println(s1);
        System.out.println(s2);
        return s1==s2;
    }
    public static void main(String[] args) {
        String str1="";
        String str2="";
        System.out.println(isPermutation(str1, str2));
    }
}

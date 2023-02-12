package com.strings;

public class ReverseStrWordWise {
    public static String reverseWordWise(String input){
        String ans = "";
        int wordStart = 0;
        for (int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if (c==' '){
                int wordEnd = i-1;

                String revWord = "";
                for (int j=wordStart;j<=wordEnd;j++){
                    revWord += input.charAt(j);
                }
                ans = revWord+" "+ans;
                wordStart = i+1;
            } else if (i==input.length()-1){
                int wordEnd = i;

                String revWord = "";
                for (int j=wordStart;j<=wordEnd;j++){
                    revWord += input.charAt(j);
                }
                ans = revWord+" "+ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "Always indent your code";
        String revStr = reverseWordWise(str);
        System.out.println(revStr);
    }
}

package com.strings;

public class ReverseEachWord {
    public static String reverseEachWord(String str){
        String ans = "";
        int wordStart = 0;
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (c==' '){
                int wordEnd = i-1;

                //reverse word
                String revWord = "";
                for (int j=wordEnd;j>=wordStart;j--){
                    revWord += str.charAt(j);
                }
                ans += revWord+" ";
                wordStart = i+1;
            } else if (i==str.length()-1){
                int wordEnd = i;

                //reverse word
                String revWord = "";
                for (int j=wordEnd;j>=wordStart;j--){
                    revWord += str.charAt(j);
                }
                ans += revWord;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "Always indent your code";
        String revStr = reverseEachWord(str);
        System.out.println(revStr);
    }
}

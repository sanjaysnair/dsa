package com.strings;

public class RemoveCharacter {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String ans = "";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=ch){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "";
        char ch = 'y';
        String ans = removeAllOccurrencesOfChar(str, ch);
        System.out.println(ans);
    }
}

package com.linear.search;

public class SearchCharInString {
    public static void main(String[] args) {
        String name = "Sanjay";
        char target = 'y';
        System.out.println(searchChar(name, target));
    }

    static boolean searchChar(String str, char ch) {
        for (int i=0; i< str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}

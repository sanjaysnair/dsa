package com.recursion2.assignment;

public class CheckAB {
    public static boolean checkAB(String input) {
        if (input.length() <= 1) {
            return true;
        }
        if (input.charAt(0) != 'a') {
            return false;
        }
        return checkAB(input, true);
    }
    public static boolean checkAB(String input, boolean gtFirstCall) {
        //System.out.println(input.length());
        if (input.length()==0){
            return true;
        }
        char c = input.charAt(0);

        int next=1;
        if (c=='a'){
            //System.out.println("IF: " + input);
            boolean check2 = false;
            if (input.length()>=2 && input.charAt(0)=='a' && input.charAt(1)=='a') {
                check2 = true;
            } else if (input.length()>=3 && input.charAt(0)=='a' && input.charAt(1)=='b' && input.charAt(2)=='b') {
                check2 = true;
            } else if (input.length()==1 && input.charAt(0)=='a') {
                check2 = true;
            }
            if (!check2){
                //System.out.println("Check2 fail");
                return false;
            }
        } else {
            //System.out.println("ELSE: " + input);
            boolean check3 = false;
            if (input.length()>=3 && input.charAt(0)=='b' && input.charAt(1)=='b' && input.charAt(2)=='a'){
                next=2;
                check3 = true;
            } else if (input.length()==2 && input.charAt(0)=='b' && input.charAt(1)=='b') {
                check3 = true;
                next=2;
            }
            if (!check3){
                //System.out.println("Check3 fail");
                return false;
            }
        }
        return checkAB(input.substring(next), true);
    }
    public static void main(String[] args) {
        String input = "abbaabb";
        System.out.println(CheckAB.checkAB(input));
    }
}

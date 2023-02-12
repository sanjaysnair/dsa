package com.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinBracketReversal {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int countBracketReversals(String input) {
        if (input.length()%2!=0){
            return -1;
        }

        Stack<Character> stack=new Stack<>();
        char[] chrs=input.toCharArray();

        for (int i=0;i<chrs.length;i++){
            if (chrs[i]=='}' && !stack.isEmpty()){
                if (stack.peek()=='{'){
                    stack.pop();
                } else {
                    stack.push(chrs[i]);
                }
            } else {
                stack.push(chrs[i]);
            }
        }
        int newSize=stack.size();
        int n=0;
        while (!stack.isEmpty() && stack.peek()=='{'){
            stack.pop();
            n++;
        }
        return (newSize/2 + n%2);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        System.out.println(countBracketReversals(br.readLine().trim()));

    }
}

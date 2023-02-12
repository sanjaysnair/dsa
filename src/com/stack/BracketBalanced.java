package com.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class BracketBalanced {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean isBalanced(String expression) {
        Stack<Character> stack=new Stack<>();
        char[] chrs = expression.toCharArray();
        for (char c: chrs) {
            if (stack.empty() && (c=='}' || c==')')){
                return false;
            } else if (c=='(' || c=='{'){
                stack.push(c);
            } else if (c==')' && stack.peek()!='(') {
                return false;
            } else if (c=='}' && stack.peek()!='{') {
                return false;
            } else {
                stack.pop();
            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        String expression = br.readLine().trim();
        System.out.println(BracketBalanced.isBalanced(expression));
    }
}
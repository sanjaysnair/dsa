package com.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class RedundantBrackets {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean checkRedundantBrackets(String expression) {
        Stack<Character> stack=new Stack<>();
        char[] chrs=expression.toCharArray();
        for (char c: chrs){
            if (c==')'){
                boolean hasOperator=false;
                char top=stack.peek();
                stack.pop();
                while (stack.isEmpty()==false && top!='('){
                    if (top=='+' || top=='-' || top=='*' || top=='/'){
                        hasOperator=true;
                    }
                    top=stack.peek();
                    stack.pop();
                }
                if (!hasOperator){
                    return true;
                }
            } else {
                stack.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        String expression = br.readLine().trim();
        System.out.println(checkRedundantBrackets(expression));
    }
}

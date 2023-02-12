package com.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpan {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws NumberFormatException, IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] values = br.readLine().trim().split(" ");

        for(int i = 0; i < size; i++) {
            input[i] = Integer.parseInt(values[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static int[] stockSpan(int[] price) {
        int[] span=new int[price.length];
        Stack<Integer> stack=new Stack<>();
        span[0]=1;
        stack.push(0);
        for (int i=1;i<price.length;i++){
            while (!stack.isEmpty() && price[stack.peek()]<price[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                span[i]=i+1;
            } else {
                span[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] input = takeInput();

        int[] output = stockSpan(input);

        printArray(output);

    }
}

package com.stack.StackCollectionImpl;

import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int arr[]={5, 6, 7, 1, 9};

        for (int elem: arr){
            stack.push(elem);
        }
        while (!stack.empty()){
            System.out.println(stack.pop());
        }

//        stack.push(5);
//        stack.push(10);
//        stack.push(15);
//        System.out.print(stack.pop()+stack.size());

//        for(int i=0;i<10;i++)
//        {
//            stack.push(i*2);
//        }
//        System.out.print(stack.peek());

        while(stack.isEmpty())
        {
            stack.push(10);
        }
        System.out.print(stack.pop()+" "+stack.size());
    }
}

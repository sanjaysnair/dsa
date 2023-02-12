package com.stack.arrayimpl;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        StackUsingArray stack = new StackUsingArray();

//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.pop();
//        stack.push(40);
//        System.out.println(stack.size());
//        System.out.println(stack.top());
//        stack.push(50);
//        stack.push(60);
//        stack.push(70);
//        stack.push(80);
//        stack.push(90);
//        stack.push(100);
//        stack.push(110);

        for (int i=0;i<34;i++){
            stack.push(i+10);
        }
    }
}

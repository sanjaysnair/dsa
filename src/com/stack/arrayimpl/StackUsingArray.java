package com.stack.arrayimpl;

public class StackUsingArray {
    private int data[];
    private int topIndex;

    public StackUsingArray(){
        data = new int[3];
        topIndex = -1;
    }

    public int size(){
        return topIndex+1;
    }

    public boolean isEmpty(){
        return topIndex==-1;
    }

    public void push(int elem) throws StackFullException {
        if (topIndex==data.length-1){
            //raise exception
            //StackFullException e = new StackFullException();
            //throw e;
            doubleCapacity();
        }
        data[++topIndex]=elem;
    }

    public int top() throws StackEmptyException {
        if (topIndex==-1){
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    public int pop() throws StackEmptyException{
        if (topIndex==-1){
            throw new StackEmptyException();
        }
        int dataToPop=data[topIndex];
        topIndex--;
        return dataToPop;
    }

    private void doubleCapacity(){
        System.out.println("Doubling the capacity.");
        int[] temp = data;
        data = new int[2 * temp.length];
        for (int i=0;i< temp.length; i++){
            data[i] = temp[i];
        }
    }
}

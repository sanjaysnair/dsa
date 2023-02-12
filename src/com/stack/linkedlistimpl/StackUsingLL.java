package com.stack.linkedlistimpl;

import com.stack.arrayimpl.StackEmptyException;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;

    public StackUsingLL(){
        head=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(T elem){
        Node<T> n = new Node<>(elem);
        if (head!=null){
            n.next=head;
        }
        head=n;
        size++;
    }

    public T top() throws StackEmptyException {
        if (head==null){
            throw new StackEmptyException();
        }
        return head.data;
    }

    public T pop() throws StackEmptyException {
        if (head==null){
            throw new StackEmptyException();
        }
        T n = head.data;
        head=head.next;
        size--;
        return n;
    }
}

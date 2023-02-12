package com.datastructures.linkedlist.recursion;

public class LinkedListInsert {
    public static Node<Integer> insert(Node<Integer> head, int ele, int pos){
        if (head==null && pos>0){
            return head;
        }
        Node<Integer> n = new Node<>(ele);
        if (pos==0){
            n.next=head;
            return n;
        } else {
            head.next = insert(n.next, ele, pos-1);
            return head;
        }

    }
    public static void main(String[] args) {
        //
    }
}

package com.datastructures.linkedlist.recursion;

public class LinkedListDelete {
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node<Integer> create(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos){
        if (head==null && pos>0){
            return head;
        }
        if (pos==0){
            return head.next;
        } else {
            head.next = deleteNodeRec(head.next, pos-1);
            return head;
        }
    }
    public static void main(String[] args) {
        Node<Integer> n = create();
        Node<Integer> d = deleteNodeRec(n, 10);
        print(d);
    }
}

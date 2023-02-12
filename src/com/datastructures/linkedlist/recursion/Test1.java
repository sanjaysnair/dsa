package com.datastructures.linkedlist.recursion;

public class Test1 {
    public static void print(Node<String> head){
        Node<String> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<String> create(){
        Node<String> n1 = new Node<>("1");
        Node<String> n2 = new Node<>("2");
        Node<String> n3 = new Node<>("3");
        Node<String> n4 = new Node<>("4");
        Node<String> n5 = new Node<>("5");
        Node<String> n6 = new Node<>("6");
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        return n1;
    }
    public static void fun(Node<String> start)
    {
        if(start == null)
            return;
        System.out.printf(start.data);

        if(start.next != null )
            fun(start.next.next);
        System.out.printf(start.data);
    }
    public static void main(String[] args) {
        Node<String> n = create();
        print(n);
        fun(n);
    }
}

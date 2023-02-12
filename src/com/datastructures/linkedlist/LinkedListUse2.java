package com.datastructures.linkedlist;

import java.util.Scanner;

public class LinkedListUse2 {
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }
    public static Node<Integer> takeInput(){
        Scanner s=new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head=null;
        Node<Integer> tail=null;
        while (data!=-1){
            Node<Integer> newNode = new Node(data);
            if (head==null){
                head = newNode;
                tail=head;
            } else {
                tail.next=newNode;
                tail=newNode;
            }
            data = s.nextInt();
        }
        return head;
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
    public static void main(String[] args) {
        Node<Integer> n = takeInput();
        //increment(n);
        print(n);
    }
}

package com.milestone3tests;

import java.util.Scanner;
import java.math.BigInteger;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class NextNumber {
    static Scanner s = new Scanner(System.in);

    public static LinkedListNode<Integer> takeInput() {
        LinkedListNode<Integer> head = null, tail = null;
        int data = s.nextInt();
        while(data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(LinkedListNode<Integer> head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }

    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        String data="";
        LinkedListNode<Integer> temp=head;
        while (temp!=null){
            data+=temp.data;
            temp=temp.next;
        }
        BigInteger newData = new BigInteger(data);
        newData=newData.add(BigInteger.valueOf(1));
        char[] newCharArray=String.valueOf(newData).toCharArray();
        temp=head;
        LinkedListNode<Integer> prev=null;
        boolean numStartFound=false;
        int i=0;
        while (temp!=null){
            if (!numStartFound && temp.data == 0) {
                prev=temp;
                temp=temp.next;
                continue;
            } else if (!numStartFound && temp.data > 0) {
                numStartFound=true;
            }
            if (temp==null){
                LinkedListNode<Integer> tempNode=new LinkedListNode<>(
                        Integer.parseInt(String.valueOf(newCharArray[i])));
                prev.next=tempNode;
                temp=tempNode;
            } else {
                temp.data = Integer.parseInt(String.valueOf(newCharArray[i]));
            }
            prev=temp;
            temp=temp.next;
            i++;
        }
        return head;
    }

    public static void main(String[] args) {

        LinkedListNode<Integer> head = takeInput();
        head = nextLargeNumber(head);
        print(head);

    }

}


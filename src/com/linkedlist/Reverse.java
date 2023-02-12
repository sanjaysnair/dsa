package com.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode10<T> {
    T data;
    LinkedListNode10<T> next;

    public LinkedListNode10(T data) {
        this.data = data;
    }
}

public class Reverse {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode10<Integer> takeInput() throws IOException {
        LinkedListNode10<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode10<Integer> newNode = new LinkedListNode10<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }

    public static void print(LinkedListNode10<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static LinkedListNode10 reverse(LinkedListNode10<Integer> root){
        LinkedListNode10 prev=null;
        LinkedListNode10 next=null;
        while (root!=null){
            next=root.next;
            root.next=prev;
            prev=root;
            root=next;
        }
        root=prev;
        return root;
    }

    public static void printReverse(LinkedListNode10<Integer> root) {
        if (root==null){
            return;
        }
        //printReverse(root.next);
        LinkedListNode10 result=reverse(root);
        print(result);
        //System.out.print(root.data+" ");
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode10<Integer> head = takeInput();
            printReverse(head);
            System.out.println();

            t -= 1;

        }

    }
}

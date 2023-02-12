package com.linkedlist.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode<T> {
    T data;
    LinkedListNode2<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class FindNode {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode2<Integer> takeInput() throws IOException {
        LinkedListNode2<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode2<Integer> newNode = new LinkedListNode2<Integer>(data);
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

    public static void print(LinkedListNode2<Integer> head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static int findNodeRec(LinkedListNode2<Integer> head, int n) {
        if (head==null){
            return -1;
        }
        int pos=-1;
        if (head.data==n){
            return 0;
        }
        return findNodeRec(head.next, n, 1);
    }

    public static int findNodeRec(LinkedListNode2<Integer> head, int n, int pos) {
        if (head==null){
            return -1;
        }
        if (head.data==n){
            return pos;
        }
        return findNodeRec(head.next, n, ++pos);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode2<Integer> head = takeInput();
            int n = Integer.parseInt(br.readLine().trim());

            System.out.println(FindNode.findNodeRec(head, n));

            t -= 1;
        }

    }
}

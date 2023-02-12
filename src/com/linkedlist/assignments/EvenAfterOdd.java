package com.linkedlist.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode6<T> {
    T data;
    LinkedListNode6<T> next;

    public LinkedListNode6(T data) {
        this.data = data;
    }
}

public class EvenAfterOdd {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode6<Integer> takeInput() throws IOException {
        LinkedListNode6<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode6<Integer> newNode = new LinkedListNode6<Integer>(data);
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

    public static void print(LinkedListNode6<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static LinkedListNode6<Integer> evenAfterOdd(LinkedListNode6<Integer> head) {
        if (head==null){
            return head;
        }
        LinkedListNode6<Integer> eh=null, et=null, oh=null, ot=null;
        while (head!=null){
            if (head.data%2==0){//even
                if (eh==null){
                    eh=head;
                    et=head;
                } else {
                    et.next=head;
                    et=head;
                }
            } else {//odd
                if (oh==null){
                    oh=head;
                    ot=head;
                } else {
                    ot.next=head;
                    ot=head;
                }
            }
            head=head.next;
        }
        if (ot!=null){
            ot.next = null;
        }
        if (et!=null){
            et.next = null;
        }

        if (oh==null)
            return eh;
        ot.next=eh;
        //et=null;
        return oh;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode6<Integer> head = takeInput();

            LinkedListNode6<Integer> newHead = evenAfterOdd(head);
            print(newHead);

            t -= 1;
        }

    }
}

package com.linkedlist.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode2<T> {
    T data;
    LinkedListNode2<T> next;

    public LinkedListNode2(T data) {
        this.data = data;
    }
}

public class EliminateDuplicates {

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

    public static void print(LinkedListNode2<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static LinkedListNode2<Integer> removeDuplicates(LinkedListNode2<Integer> head) {
        if (head==null){
            return head;
        }

        LinkedListNode2<Integer> prev = null;
        LinkedListNode2<Integer> curr = head;
        while (curr!=null){
            System.out.println(prev+" > "+curr.data);
            if (prev==null){
                prev=curr;
                curr=curr.next;
                continue;
            }
            if (!prev.data.equals(curr.data)){
                System.out.println("<> : "+prev.data+" - "+curr.data);
                prev.next=curr;
                prev=curr;
                curr=curr.next;
            } else {
                System.out.println("== : "+prev.data+" - "+curr.data);
                if (prev.data.equals(curr.data) && curr.next==null){
                    prev.next=null;
                    return head;
                }
                curr=curr.next;
            }
        }
        return head;

        /*LinkedListNode2 temp=head;
        while (temp!=null){
            if (temp.next==null){
                return head;
            } else if (temp.data==temp.next.data){
                temp.next=temp.next.next;
            } else {
                temp=temp.next;
            }
        }
        return head;*/

        /*LinkedListNode2 dummy = new LinkedListNode2(-101);
        // dummy.next = head;
        LinkedListNode2 cur = head;
        LinkedListNode2 prev = dummy;

        while (cur != null){
            if (cur.data!=prev.data){
                prev.next = cur;
                prev = prev.next;
                cur = cur.next;
                prev.next = null;
            } else{
                cur = cur.next;
            }
        }
        return dummy.next;*/
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode2<Integer> head = takeInput();

            head = removeDuplicates(head);
            print(head);

            t -= 1;
        }

    }
}
package com.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class MergeSortedLinkedList {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
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

    public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if (head1==null && head2==null){
            return head1;
        } else if (head1==null && head2!=null){
            return head2;
        } else if (head1!=null && head2==null){
            return head1;
        }
        LinkedListNode<Integer> t1=head1;
        LinkedListNode<Integer> t2=head2;
        LinkedListNode<Integer> head=null;
        LinkedListNode<Integer> temp=null;

        while (t1!=null && t2!=null){

            if (t1.data<t2.data){
                if (temp==null){
                    temp=t1;
                    head=temp;
                } else {
                    temp.next=t1;
                    temp=temp.next;
                }

                if (t1.next==null){
                    t1.next=t2;
                    break;
                }
                t1=t1.next;
            } else {
                if (temp==null){
                    temp=t2;
                    head=temp;
                } else {
                    temp.next=t2;
                    temp=temp.next;
                }

                if (t2.next==null){
                    t2.next=t1;
                    break;
                }
                t2=t2.next;

            }
        }
        return head;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode<Integer> head1 = takeInput();
            LinkedListNode<Integer> head2 = takeInput();

            LinkedListNode<Integer> newHead = mergeTwoSortedLinkedLists(head1, head2);
            print(newHead);

            t -= 1;
        }

    }
}

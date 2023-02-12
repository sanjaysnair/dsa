package com.linkedlist.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode5<T> {
    T data;
    LinkedListNode5<T> next;

    public LinkedListNode5(T data) {
        this.data = data;
    }
}

public class BubbleSortIterativeLL {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode5<Integer> takeInput() throws IOException {
        LinkedListNode5<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode5<Integer> newNode = new LinkedListNode5<Integer>(data);
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

    public static void print(LinkedListNode5<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static LinkedListNode5<Integer> bubbleSort(LinkedListNode5<Integer> head) {
        if (head==null){
            return head;
        }
        int cnt=0;
        LinkedListNode5<Integer> temp=head;
        while (true){

            LinkedListNode5<Integer> prev=null;
            LinkedListNode5<Integer> curr=temp;
            LinkedListNode5<Integer> next=curr.next;
            boolean hasSwapped=false;
            while (temp.next!=null){
                // if (prev==null){
                // 	System.out.println("prev=null curr="+curr.data+" next="+next.data);
                // } else {
                // 	System.out.println("prev="+prev.data+" curr="+curr.data+" next="+next.data);
                // }

                LinkedListNode5<Integer> oldNextNext=next.next;
                if (curr.data>next.data){// swap case
                    if (prev==null){
                        head=curr.next;
                    } else {
                        prev.next=curr.next;
                    }
                    LinkedListNode5<Integer> t=next.next;
                    next.next=curr;
                    curr.next=t;
                    hasSwapped=true;


                    // move pointers
                    //LinkedListNode5<Integer> oldNext=next;
                    //System.out.println("oldNextNext="+oldNextNext.data);
                    prev=next;
                    next=oldNextNext;
                    //System.out.println("After moving pointers: prev="+prev.data+" curr="+curr.data+" next="+next.data);
                    //System.out.println("Swapped\n");
                } else {
                    //LinkedListNode5<Integer> oldNext=next;
                    //System.out.println("oldNextNext="+oldNextNext.data);
                    prev=curr;
                    curr=next;
                    next=oldNextNext;
                    //System.out.println("After moving pointers: prev="+prev.data+" curr="+curr.data+" next="+next.data);
                    //System.out.println("No Swap\n");
                }
                if (temp.next==null){
                    break;
                }
                temp=temp.next;
                cnt++;
            }
            if (hasSwapped==false){
                break;
            }
            temp=head;
            prev=null;
            curr=temp;
            next=curr.next;
        }
        return head;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        LinkedListNode5<Integer> head = takeInput();

        head = bubbleSort(head);
        print(head);
    }
}
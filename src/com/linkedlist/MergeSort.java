package com.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode8<T> {
    T data;
    LinkedListNode8<T> next;

    public LinkedListNode8(T data) {
        this.data = data;
    }
}

public class MergeSort {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode8<Integer> takeInput() throws IOException {
        LinkedListNode8<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode8<Integer> newNode = new LinkedListNode8<Integer>(data);
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

    public static void print(LinkedListNode8<Integer> head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static LinkedListNode8<Integer> midPoint(LinkedListNode8<Integer> head) {
        LinkedListNode8<Integer> s=head;
        LinkedListNode8<Integer> f=head;
        while (f!=null){
            if (f.next==null || f.next.next==null){
                return s;
            }
            s = s.next;
            f = f.next.next;
            if (f.next==null || f.next.next==null){
                return s;
            }
        }
        return s;
    }

    public static LinkedListNode8<Integer> mergeTwoSortedLinkedLists(LinkedListNode8<Integer> head1, LinkedListNode8<Integer> head2) {
        if (head1==null && head2==null){
            return head1;
        } else if (head1==null && head2!=null){
            return head2;
        } else if (head1!=null && head2==null){
            return head1;
        }
        LinkedListNode8<Integer> t1=head1;
        LinkedListNode8<Integer> t2=head2;
        LinkedListNode8<Integer> head=null;
        LinkedListNode8<Integer> temp=null;

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

    public static LinkedListNode8<Integer> mergeSort(LinkedListNode8<Integer> head) {
        if (head==null || head.next==null){//base case 0 or 1 node
            return head;
        }
        //find mid
        LinkedListNode8 mid = midPoint(head);
        LinkedListNode8 part1head = head;
        LinkedListNode8 part2head = mid.next;
        mid.next=null;
        LinkedListNode8 list1 = mergeSort(part1head);
        LinkedListNode8 list2 = mergeSort(part2head);
        return mergeTwoSortedLinkedLists(list1, list2);

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode8<Integer> head = takeInput();

            LinkedListNode8<Integer> newHead = mergeSort(head);
            print(newHead);

            t -= 1;
        }

    }
}

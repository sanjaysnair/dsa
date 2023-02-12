package com.linkedlist.assignments;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode3<T> {
    T data;
    LinkedListNode3<T> next;

    public LinkedListNode3(T data) {
        this.data = data;
    }
}

public class Swap2Nodes {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode3<Integer> takeInput() throws IOException {
        LinkedListNode3<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode3<Integer> newNode = new LinkedListNode3<Integer>(data);
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

    public static void print(LinkedListNode3<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static LinkedListNode3<Integer> swapNodes(LinkedListNode3<Integer> head, int i, int j) {
        if (i==j){
            return head;
        } else if (i>j){
            int temp=i;
            i=j;
            j=temp;
        }
        LinkedListNode3<Integer> temp=head;
        LinkedListNode3<Integer> t=null;
        LinkedListNode3<Integer> p1=null;
        LinkedListNode3<Integer> p2=null;
        LinkedListNode3<Integer> c1=null;
        LinkedListNode3<Integer> c2=null;
        int cnt=0;
        while (cnt<=j && temp!=null){
            if (cnt==i-1){
                p1=temp;
            } else if (cnt==i){
                c1=temp;
            } else if (cnt==j-1){
                p2=temp;
            } else if (cnt==j){
                c2=temp;
            }
            temp=temp.next;
            cnt++;
        }
        if (i==0){
            t=c1.next;
            c1.next=c2.next;
            c2.next=t;
            p2.next=c1;
            head=c2;
        } else if (j-i==1){
            p1.next=c2;
            t=c1;
            c1.next=c2.next;
            c2.next=t;
        } else {
            p1.next = c2;
            p2.next = c1;
            t = c1.next;
            c1.next = c2.next;
            c2.next = t;
        }

        return head;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode3<Integer> head = takeInput();
            String[] i_j = br.readLine().trim().split("\\s");

            int i = Integer.parseInt(i_j[0]);
            int j = Integer.parseInt(i_j[1]);

            LinkedListNode3<Integer> newHead = swapNodes(head, i, j);
            print(newHead);

            t -= 1;
        }

    }
}
package com.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode7<T> {
    T data;
    LinkedListNode7<T> next;

    public LinkedListNode7(T data) {
        this.data = data;
    }
}

public class MidPoint {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode7<Integer> takeInput() throws IOException {
        LinkedListNode7<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode7<Integer> newNode = new LinkedListNode7<Integer>(data);
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

    public static void print(LinkedListNode7<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static LinkedListNode7<Integer> midPoint(LinkedListNode7<Integer> head) {
        LinkedListNode7<Integer> s=head;
        LinkedListNode7<Integer> f=head;
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

    public static void main(String[] args) throws NumberFormatException, IOException {

        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode7<Integer> head = takeInput();

            LinkedListNode7<Integer> mid = midPoint(head);

            if (mid != null) {
                System.out.println(mid.data);
            }

            t -= 1;
        }

    }
}

package com.linkedlist.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode4<T> {
    T data;
    LinkedListNode4<T> next;

    public LinkedListNode4(T data) {
        this.data = data;
    }
}

public class KReverseLL {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode4<Integer> takeInput() throws IOException {
        LinkedListNode4<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode4<Integer> newNode = new LinkedListNode4<Integer>(data);
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

    public static void print(LinkedListNode4<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static LinkedListNode4<Integer> reverse(LinkedListNode4<Integer> head) {
        LinkedListNode4 prev=null;
        LinkedListNode4 curr=head;
        LinkedListNode4 nxt=curr.next;
        while (nxt!=null){
            curr.next=prev;
            LinkedListNode4 t=nxt.next;
            nxt.next=curr;

            prev=curr;
            curr=nxt;
            nxt=t;
        }
        head=curr;
        return head;
    }

    public static LinkedListNode4<Integer> kReverse(LinkedListNode4<Integer> head, int k) {
        if (head==null){
            return head;
        }
        int cnt=0;
        LinkedListNode4 start=head;
        LinkedListNode4 end=head;
        LinkedListNode4 prev=null;
        while (cnt<k-1 && end.next!=null){
            end=end.next;
            cnt++;
        }
        LinkedListNode4 nxt=end.next;
        end.next=null;

        LinkedListNode4 revList = reverse(start);
        head=revList;
        LinkedListNode4 revListTmp = revList;
        while (revListTmp.next!=null){
            revListTmp=revListTmp.next;
        }
        revListTmp.next=kReverse(nxt, k);
        return head;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode4<Integer> head = takeInput();
            int k = Integer.parseInt(br.readLine().trim());

            LinkedListNode4<Integer> newHead = kReverse(head, k);
            print(newHead);

            t -= 1;
        }

    }
}

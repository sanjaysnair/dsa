package com.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode9<T> {
    T data;
    LinkedListNode9<T> next;

    public LinkedListNode9(T data) {
        this.data = data;
    }
}

public class Palindrome {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode9<Integer> takeInput() throws IOException {
        LinkedListNode9<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode9<Integer> newNode = new LinkedListNode9<Integer>(data);
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

    public static void print(LinkedListNode9<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static LinkedListNode9<Integer> midPoint(LinkedListNode9<Integer> head) {
        LinkedListNode9<Integer> s=head;
        LinkedListNode9<Integer> f=head;
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

    public static LinkedListNode9 reverse(LinkedListNode9<Integer> head){
        LinkedListNode9 prev=null;
        LinkedListNode9 next=null;
        while (head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        head=prev;
        return head;
    }

    public static boolean isPalindrome(LinkedListNode9<Integer> head) {
        if (head==null){
            return true;
        }
        LinkedListNode9<Integer> mid=midPoint(head);
        LinkedListNode9<Integer> part1=head;
        LinkedListNode9<Integer> part2=mid.next;
        mid.next=null;
        part2 = reverse(part2);
        while (part1 != null && part2!=null) {
            if (part1.data!=part2.data){
                return false;
            }
            part1=part1.next;
            part2=part2.next;
        }
        return true;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode9<Integer> head = takeInput();

            boolean ans = isPalindrome(head);
            System.out.println(ans);

            t -= 1;

        }

    }
}

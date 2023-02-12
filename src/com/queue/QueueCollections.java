package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueCollections {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println();

        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=1;i<5;i++)
        {
            q.add(10+i);
        }
        System.out.print(q.poll()+" "+q.size());
        System.out.println();

        Queue<Integer> q2=new LinkedList<Integer>();
        Stack<Integer> s=new Stack<Integer>();
        q2.add(5);
        q2.add(10);
        s.push(10);
        s.push(20);
        System.out.print(q2.peek()+s.pop());
    }
}

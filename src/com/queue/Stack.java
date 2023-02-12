package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {

    //Define the data members
    Queue<Integer> q1;
    Queue<Integer> q2;

    public Stack() {
        //Implement the Constructor
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        return q1.size();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void push(int element) {
        if (q1.isEmpty()){
            q1.add(element);
        } else {
            q2.add(element);
            while (!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1=q2;
            q2=new LinkedList<>();
        }
    }

    public int pop() {
        if (q1.isEmpty()){
            return -1;
        }
        return q1.remove();
    }


    public int top() {
        if (q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
}

package com.binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class QueueEmptyException7 extends Exception {

}

class QueueUsingLL7<T> {

    class Node<T> {
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public T front() throws QueueEmptyException7{
        if(size == 0){
            QueueEmptyException7 e = new QueueEmptyException7();
            throw e;
        }

        return head.data;
    }


    public void enqueue(T element){
        Node<T> newNode = new Node<T>(element);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public T dequeue() throws QueueEmptyException7{
        if(head == null){
            QueueEmptyException7 e = new QueueEmptyException7();
            throw e;
        }
        if(head == tail){
            tail = null;
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}


class BinaryTreeNode8<T> {
    T data;
    BinaryTreeNode8<T> left;
    BinaryTreeNode8<T> right;

    public BinaryTreeNode8(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class IsNodePresent {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BinaryTreeNode8<Integer> takeInput() throws NumberFormatException, IOException {
        QueueUsingLL7<BinaryTreeNode8<Integer>>  pendingNodes = new QueueUsingLL7<BinaryTreeNode8<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        if (nodeDatas.length == 1) {
            return null;
        }

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode8<Integer> root = new BinaryTreeNode8<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode8<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException7 e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(leftChildData != -1){
                BinaryTreeNode8<Integer> leftChild = new BinaryTreeNode8<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(rightChildData != -1){
                BinaryTreeNode8<Integer> rightChild = new BinaryTreeNode8<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }

    public static boolean isNodePresent(BinaryTreeNode8<Integer> root, int x) {
        if (root==null){
            return false;
        }
        if (root.data.equals(x)){
            return true;
        }
        if (isNodePresent(root.left, x)){
            return true;
        }
        if (isNodePresent(root.right, x)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BinaryTreeNode8<Integer> root = takeInput();
        int x = Integer.parseInt(br.readLine().trim());

        boolean ans = isNodePresent(root, x);

        System.out.println(ans);
    }
}

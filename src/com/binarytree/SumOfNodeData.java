package com.binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class QueueEmptyException extends Exception {

}

class QueueUsingLL<T> {

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

    public T front() throws QueueEmptyException{
        if(size == 0){
            QueueEmptyException e = new QueueEmptyException();
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

    public T dequeue() throws QueueEmptyException{
        if(head == null){
            QueueEmptyException e = new QueueEmptyException();
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


class BinaryTreeNode2<T> {
    T data;
    BinaryTreeNode2<T> left;
    BinaryTreeNode2<T> right;

    public BinaryTreeNode2(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class SumOfNodeData {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BinaryTreeNode2<Integer> takeInput() throws NumberFormatException, IOException {
        QueueUsingLL<BinaryTreeNode2<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode2<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode2<Integer> root = new BinaryTreeNode2<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode2<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(leftChildData != -1){
                BinaryTreeNode2<Integer> leftChild = new BinaryTreeNode2<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(rightChildData != -1){
                BinaryTreeNode2<Integer> rightChild = new BinaryTreeNode2<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }

    public static int getSum(BinaryTreeNode2<Integer> root) {
        if (root == null) {
            return 0;
        }
        return root.data + getSum(root.left) + getSum(root.right);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BinaryTreeNode2<Integer> root = takeInput();
        System.out.println(getSum(root));
    }
}
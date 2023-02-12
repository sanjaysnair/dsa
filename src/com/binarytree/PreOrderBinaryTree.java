package com.binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class QueueEmptyException2 extends Exception {

}

class QueueUsingLL2<T> {

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

    public T front() throws QueueEmptyException2{
        if(size == 0){
            QueueEmptyException2 e = new QueueEmptyException2();
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

    public T dequeue() throws QueueEmptyException2{
        if(head == null){
            QueueEmptyException2 e = new QueueEmptyException2();
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


class BinaryTreeNode3<T> {
    T data;
    BinaryTreeNode3<T> left;
    BinaryTreeNode3<T> right;

    public BinaryTreeNode3(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class PreOrderBinaryTree {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BinaryTreeNode3<Integer> takeInput() throws NumberFormatException, IOException {
        QueueUsingLL2<BinaryTreeNode3<Integer>>  pendingNodes = new QueueUsingLL2<BinaryTreeNode3<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode3<Integer> root = new BinaryTreeNode3<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode3<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException2 e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(leftChildData != -1){
                BinaryTreeNode3<Integer> leftChild = new BinaryTreeNode3<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(rightChildData != -1){
                BinaryTreeNode3<Integer> rightChild = new BinaryTreeNode3<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }

    public static void preOrder(BinaryTreeNode3<Integer> root) {
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BinaryTreeNode3<Integer> root = takeInput();
        preOrder(root);
    }
}

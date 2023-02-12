package com.binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class QueueEmptyException5 extends Exception {

}

class QueueUsingLL5<T> {

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

    public T front() throws QueueEmptyException5{
        if(size == 0){
            QueueEmptyException5 e = new QueueEmptyException5();
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

    public T dequeue() throws QueueEmptyException5{
        if(head == null){
            QueueEmptyException5 e = new QueueEmptyException5();
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


class BinaryTreeNode6<T> {
    T data;
    BinaryTreeNode6<T> left;
    BinaryTreeNode6<T> right;

    public BinaryTreeNode6(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class HeightOfBTree {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BinaryTreeNode6<Integer> takeInput() throws NumberFormatException, IOException {
        QueueUsingLL5<BinaryTreeNode6<Integer>>  pendingNodes = new QueueUsingLL5<BinaryTreeNode6<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        if (nodeDatas.length == 1) {
            return null;
        }

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode6<Integer> root = new BinaryTreeNode6<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode6<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException5 e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(leftChildData != -1){
                BinaryTreeNode6<Integer> leftChild = new BinaryTreeNode6<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(rightChildData != -1){
                BinaryTreeNode6<Integer> rightChild = new BinaryTreeNode6<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }

    public static int height(BinaryTreeNode6<Integer> root) {
        if (root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int temp;
        if (leftHeight>rightHeight){
            temp=leftHeight;
        } else {
            temp=rightHeight;
        }
        return 1 + temp;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BinaryTreeNode6<Integer> root = takeInput();

        int h = height(root);

        System.out.println(h);
    }
}

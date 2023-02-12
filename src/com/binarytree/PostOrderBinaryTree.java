package com.binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class QueueEmptyException3 extends Exception {

}

class QueueUsingLL3<T> {

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

    public T front() throws QueueEmptyException3{
        if(size == 0){
            QueueEmptyException3 e = new QueueEmptyException3();
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

    public T dequeue() throws QueueEmptyException3{
        if(head == null){
            QueueEmptyException3 e = new QueueEmptyException3();
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


class BinaryTreeNode4<T> {
    T data;
    BinaryTreeNode4<T> left;
    BinaryTreeNode4<T> right;

    public BinaryTreeNode4(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class PostOrderBinaryTree {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BinaryTreeNode4<Integer> takeInput() throws NumberFormatException, IOException {
        QueueUsingLL3<BinaryTreeNode4<Integer>>  pendingNodes = new QueueUsingLL3<BinaryTreeNode4<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode4<Integer> root = new BinaryTreeNode4<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode4<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException3 e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(leftChildData != -1){
                BinaryTreeNode4<Integer> leftChild = new BinaryTreeNode4<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(rightChildData != -1){
                BinaryTreeNode4<Integer> rightChild = new BinaryTreeNode4<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }

    public static void postOrder(BinaryTreeNode4<Integer> root) {
        if (root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BinaryTreeNode4<Integer> root = takeInput();
        postOrder(root);
    }
}

package com.binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class QueueEmptyException6 extends Exception {

}

class QueueUsingLL6<T> {

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

    public T front() throws QueueEmptyException6{
        if(size == 0){
            QueueEmptyException6 e = new QueueEmptyException6();
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

    public T dequeue() throws QueueEmptyException6{
        if(head == null){
            QueueEmptyException6 e = new QueueEmptyException6();
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


class BinaryTreeNode7<T> {
    T data;
    BinaryTreeNode7<T> left;
    BinaryTreeNode7<T> right;

    public BinaryTreeNode7(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class ReplaceNodeWithDepth {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BinaryTreeNode7<Integer> takeInput() throws NumberFormatException, IOException {
        QueueUsingLL6<BinaryTreeNode7<Integer>>  pendingNodes = new QueueUsingLL6<BinaryTreeNode7<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        if (nodeDatas.length == 1) {
            return null;
        }

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode7<Integer> root = new BinaryTreeNode7<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode7<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException6 e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(leftChildData != -1){
                BinaryTreeNode7<Integer> leftChild = new BinaryTreeNode7<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(rightChildData != -1){
                BinaryTreeNode7<Integer> rightChild = new BinaryTreeNode7<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }

    public static void inOrder(BinaryTreeNode7<Integer> root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }
    public static void changeToDepthTree(BinaryTreeNode7<Integer> root, int depth) {
        if (root==null){
            return;
        }
        root.data=depth;
        depth++;
        changeToDepthTree(root.left, depth);
        changeToDepthTree(root.right, depth);
    }

    public static void changeToDepthTree(BinaryTreeNode7<Integer> root) {
        if (root==null){
            return;
        }
        int depth=0;
        root.data=depth;
        depth++;
        changeToDepthTree(root.left, depth);
        changeToDepthTree(root.right, depth);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BinaryTreeNode7<Integer> root = takeInput();

        changeToDepthTree(root);
        inOrder(root);
    }
}

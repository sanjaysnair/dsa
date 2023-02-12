package com.binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class QueueEmptyException8 extends Exception {

}

class QueueUsingLL8<T> {

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

    public T front() throws QueueEmptyException8{
        if(size == 0){
            QueueEmptyException8 e = new QueueEmptyException8();
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

    public T dequeue() throws QueueEmptyException8{
        if(head == null){
            QueueEmptyException8 e = new QueueEmptyException8();
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


class BinaryTreeNode9<T> {
    T data;
    BinaryTreeNode9<T> left;
    BinaryTreeNode9<T> right;

    public BinaryTreeNode9(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class NodesWithoutSibling {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BinaryTreeNode9<Integer> takeInput() throws NumberFormatException, IOException {
        QueueUsingLL8<BinaryTreeNode9<Integer>>  pendingNodes = new QueueUsingLL8<BinaryTreeNode9<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        if (nodeDatas.length == 1) {
            return null;
        }

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode9<Integer> root = new BinaryTreeNode9<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode9<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException8 e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(leftChildData != -1){
                BinaryTreeNode9<Integer> leftChild = new BinaryTreeNode9<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(rightChildData != -1){
                BinaryTreeNode9<Integer> rightChild = new BinaryTreeNode9<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }

    public static void printNodesWithoutSibling(BinaryTreeNode9<Integer> root) {
        if (root==null){
            return;
        }
        if (root.left!=null && root.right==null) {
            System.out.print(root.left.data+" ");
        } else if (root.left==null && root.right!=null) {
            System.out.print(root.right.data+" ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BinaryTreeNode9<Integer> root = takeInput();

        printNodesWithoutSibling(root);

    }
}

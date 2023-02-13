package com.binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class QueueEmptyException11 extends Exception {

}

class QueueUsingLL11<T> {

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

    public T front() throws QueueEmptyException11{
        if(size == 0){
            QueueEmptyException11 e = new QueueEmptyException11();
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

    public T dequeue() throws QueueEmptyException11{
        if(head == null){
            QueueEmptyException11 e = new QueueEmptyException11();
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


class BinaryTreeNode11<T> {
    T data;
    BinaryTreeNode11<T> left;
    BinaryTreeNode11<T> right;

    public BinaryTreeNode11(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class MirrorBinaryTree {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BinaryTreeNode11<Integer> takeInput() throws NumberFormatException, IOException {
        QueueUsingLL11<BinaryTreeNode11<Integer>>  pendingNodes = new QueueUsingLL11<BinaryTreeNode11<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        if (nodeDatas.length == 1) {
            return null;
        }

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode11<Integer> root = new BinaryTreeNode11<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode11<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException11 e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(leftChildData != -1){
                BinaryTreeNode11<Integer> leftChild = new BinaryTreeNode11<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(rightChildData != -1){
                BinaryTreeNode11<Integer> rightChild = new BinaryTreeNode11<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }


    private static void printLevelWise(BinaryTreeNode11<Integer> root){
        QueueUsingLL11<BinaryTreeNode11<Integer>>  primary = new QueueUsingLL11<>();
        QueueUsingLL11<BinaryTreeNode11<Integer>>  secondary = new QueueUsingLL11<>();

        primary.enqueue(root);

        while(!primary.isEmpty()){
            BinaryTreeNode11<Integer> current=null;
            try {
                current = primary.dequeue();
            } catch (QueueEmptyException11 e) {
                System.out.println("Not possible");
            }
            System.out.print(current.data + " ");
            if(current.left != null){
                secondary.enqueue(current.left);
            }
            if(current.right != null){
                secondary.enqueue(current.right);
            }
            if(primary.isEmpty()){
                QueueUsingLL11<BinaryTreeNode11<Integer>>  temp = secondary;
                secondary = primary;
                primary = temp;
                System.out.println();
            }
        }
    }

    public static void mirrorBinaryTree(BinaryTreeNode11<Integer> root){
        if (root==null) {
            return;
        }
        if (root.left==null && root.right==null){
            return;
        }
        mirrorBinaryTree(root.right);
        mirrorBinaryTree(root.left);
        BinaryTreeNode11<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BinaryTreeNode11<Integer> root = takeInput();

        mirrorBinaryTree(root);
        printLevelWise(root);

    }
}

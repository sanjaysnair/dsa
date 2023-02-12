package com.binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class QueueEmptyException4 extends Exception {

}

class QueueUsingLL4<T> {

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

    public T front() throws QueueEmptyException4{
        if(size == 0){
            QueueEmptyException4 e = new QueueEmptyException4();
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

    public T dequeue() throws QueueEmptyException4{
        if(head == null){
            QueueEmptyException4 e = new QueueEmptyException4();
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


class BinaryTreeNode5<T> {
    T data;
    BinaryTreeNode5<T> left;
    BinaryTreeNode5<T> right;

    public BinaryTreeNode5(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class NodeGreaterThanX {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BinaryTreeNode5<Integer> takeInput() throws NumberFormatException, IOException {
        QueueUsingLL4<BinaryTreeNode5<Integer>>  pendingNodes = new QueueUsingLL4<BinaryTreeNode5<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode5<Integer> root = new BinaryTreeNode5<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode5<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException4 e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(leftChildData != -1){
                BinaryTreeNode5<Integer> leftChild = new BinaryTreeNode5<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(rightChildData != -1){
                BinaryTreeNode5<Integer> rightChild = new BinaryTreeNode5<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }

    public static int countNodesGreaterThanX(BinaryTreeNode5<Integer> root, int x) {
        if (root==null){
            return 0;
        }

        int cnt=0;
        cnt=countNodesGreaterThanX(root.left, x, cnt);
        cnt+=countNodesGreaterThanX(root.right, x, cnt);
        if (root.data>x){
            cnt++;
        }
        return cnt;
    }

    public static int countNodesGreaterThanX(BinaryTreeNode5<Integer> root, int x, int cnt) {
        if (root==null){
            return 0;
        }
        cnt=countNodesGreaterThanX(root.left, x, cnt);
        cnt+=countNodesGreaterThanX(root.right, x, cnt);
        if (root.data>x){
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BinaryTreeNode5<Integer> root = takeInput();
        int x = Integer.parseInt(br.readLine().trim());
        int count = countNodesGreaterThanX(root, x);

        System.out.println(count);
    }
}

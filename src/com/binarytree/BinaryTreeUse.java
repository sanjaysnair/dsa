package com.binarytree;

import java.util.Scanner;

public class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeTreeInput(boolean isRoot,
                                                        int parentData,
                                                        boolean isLeft,
                                                        boolean isRight){
        if (isRoot) {
            System.out.println("Enter root data");
        } else if (isLeft) {
            System.out.println("Enter left data of "+ parentData);
        } else if (isRight) {
            System.out.println("Enter right data of "+ parentData);
        }

        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild=takeTreeInput(false, rootData, true, false);
        BinaryTreeNode<Integer> rightChild=takeTreeInput(false, rootData, false, true);
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }
    public static void printTree(BinaryTreeNode<Integer> root){
        if (root==null){
            return;
        }
        System.out.print(root.data+":");
        if (root.left!=null){
            System.out.print("L"+root.left.data+",");
        }
        if (root.right!=null){
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
    public static int numNodes(BinaryTreeNode<Integer> root){
        if (root==null){
            return 0;
        }
        return 1 + numNodes(root.left) + numNodes(root.right);
    }
    public static int largest(BinaryTreeNode<Integer> root){
        if (root==null){
            return -1;
        }
        int largestLeft=largest(root.left);
        int largestRight=largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }
    public static int numLeaves(BinaryTreeNode<Integer> root){
        if (root==null){
            return 0;
        }
        if (root.left==null && root.right==null){
            return 1;
        }
        return numLeaves(root.left) + numLeaves(root.right);
    }
    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k){
        if (root==null){
            return;
        }
        if (k==0){
            System.out.println(root.data);
            return;
        }
        printAtDepthK(root.left, k-1);
        printAtDepthK(root.right, k-1);
    }
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> rootLeft=new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> rootRight=new BinaryTreeNode<>(3);
//        root.left=rootLeft;
//        root.right=rootRight;
//
//        BinaryTreeNode<Integer> twoRight=new BinaryTreeNode<>(4);
//        BinaryTreeNode<Integer> threeLeft=new BinaryTreeNode<>(5);
//        rootLeft.right=twoRight;
//        rootRight.left=threeLeft;
        BinaryTreeNode<Integer> root=takeTreeInput(true, 0, false, false);
        System.out.println("Num of nodes: " + numNodes(root));
        System.out.println("Largest: " + largest(root));
        System.out.println("Num of leaves: " + numLeaves(root));
        System.out.println("Print at depth K");
        printAtDepthK(root, 2);
        printTree(root);
    }
}

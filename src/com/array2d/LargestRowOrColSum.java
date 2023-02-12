package com.array2d;

import java.util.Scanner;

public class LargestRowOrColSum {
    public static void print(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num of rows: ");
        int rows=s.nextInt();
        System.out.println("Enter num of cols:");
        int cols=s.nextInt();
        int[][] arr=new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.println("Enter Array["+i+", "+j+"]:");
                arr[i][j]=s.nextInt();
            }
        }
        return arr;
    }
    public static void findLargest(int mat[][]){
        int largestSum=Integer.MIN_VALUE;
        int index=0;
        String rowOrCol="row";
        if (mat.length==0||mat[0].length==0){
            System.out.println(rowOrCol+" "+index+" "+largestSum);
            return;
        }
        for (int i=0;i<mat.length;i++){
            int rowSum=0;
            for (int j=0;j<mat[i].length;j++){
                rowSum+=mat[i][j];
            }
            if (rowSum>largestSum){
                largestSum=rowSum;
                rowOrCol="row";
                index=i;
            }
        }

        for (int j=0;j<mat[0].length;j++){
            int colSum=0;
            for (int i=0;i<mat.length;i++){
                colSum+=mat[i][j];
            }
            if (colSum>largestSum){
                largestSum=colSum;
                rowOrCol="column";
                index=j;
            }
        }
        //System.out.println("largestSum="+largestSum);
        //System.out.println("rowOrCol="+rowOrCol);
        //System.out.println("index="+index);
        System.out.println(rowOrCol+" "+index+" "+largestSum);
    }
    public static void main(String[] args) {
        int[][] arr=takeInput();
        findLargest(arr);
    }
}

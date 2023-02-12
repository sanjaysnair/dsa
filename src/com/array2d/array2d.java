package com.array2d;

import java.util.Scanner;

public class array2d {
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
    public static void main(String[] args) {
        int[][] arr=takeInput();
        print(arr);
    }
}

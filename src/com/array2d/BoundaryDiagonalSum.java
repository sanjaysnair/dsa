package com.array2d;

import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoundaryDiagonalSum {
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
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        int n = Integer.parseInt(br.readLine().trim());

        if (n == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] strNums;
            strNums = br.readLine().trim().split("\\s");

            for (int col = 0; col < n; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }

    public static void totalSum(int[][] mat) {
        if (mat.length==0 || mat[0].length==0){
            System.out.println(0);
            return;
        }else if (mat.length==1){
            System.out.println(mat[0][0]);
            return;
        }
        int sum=0;

        for (int i=0;i<mat.length;i++){//row 0
            sum += mat[0][i];
        }
        for (int i=0;i<mat.length;i++){// row last
            sum += mat[mat.length - 1][i];
        }
        for (int i=1;i<mat.length-1;i++){// col 0
            sum += mat[i][0];
        }
        for (int i=1;i<mat.length-1;i++){// col last
            sum += mat[i][mat.length - 1];
        }
        //System.out.println("sum="+sum);
        String[] firstDiagonal=new String[mat.length-2];
        for (int i=1;i<mat.length-1;i++){// first diagonal
            //System.out.println("i="+i+", mat[i][i]="+mat[i][i]);
            sum += mat[i][i];
            firstDiagonal[i-1]=i+""+i;
        }
        int i=1;
        int j=mat.length-2;
        while (i<mat.length-1){
            //System.out.println("i="+i+", j="+j+", mat[i][j]="+mat[i][j]);

            //System.out.println();
            //System.out.println("Check if exists: "+i+""+j);
            boolean check
                    = Arrays.asList(firstDiagonal)
                    .contains(i+""+j);
            if (!check) {
                //System.out.println(mat[i][j]+ " not exists");
                sum += mat[i][j];
            }
            i++;
            j--;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) throws IOException {
        int[][] arr=take2DInput();
        totalSum(arr);
    }
}

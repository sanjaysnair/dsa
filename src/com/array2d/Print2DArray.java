package com.array2d;

import java.util.Scanner;

public class Print2DArray {
    static Scanner s = new Scanner(System.in);

    public static int[][] takeInput(){
        int numRows = s.nextInt();
        int numCols = s.nextInt();
        int[][] input = new int[numRows][numCols];
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }
    public static void print2DArray(int input[][]) {

        for (int i=0;i<input.length;i++){
            int repeat = input.length-i;
            while (repeat>0) {
                for (int j = 0; j < input[0].length; j++) {
                    System.out.print(input[i][j] + " ");
                }
                System.out.println();
                repeat--;
            }
        }

    }
    public static void main(String[] args) {
        int[][] input = takeInput();
        Print2DArray.print2DArray(input);
    }
}

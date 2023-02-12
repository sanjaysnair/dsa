package com.linear.search;

public class FindMax2D {
    public static void main(String[] args) {
        int[][] arr = {
                {45, 56, 9},
                {1000},
                {22, 88, -9, 99}
        };
        System.out.println(find(arr));
    }

    static int find(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row: arr) {
            for (int col: row) {
                if (col > max) {
                    max = col;
                }
            }
        }
        return max;
    }
}

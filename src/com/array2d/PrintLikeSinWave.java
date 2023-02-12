package com.array2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintLikeSinWave {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums;
            strNums = br.readLine().trim().split("\\s");

            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }
    public static void wavePrint(int mat[][]){
        if (mat.length==0 || mat[0].length==0){
            return;
        }
        int x=0, y=0, total=0;
        char ord='a';
        while (total<mat.length*mat[0].length){
            if (ord=='a'){
                System.out.print(mat[x][y]+" ");
                x++;
            } else {
                System.out.print(mat[x][y]+" ");
                x--;
            }
            if (x==mat.length){
                x--;y++;ord='d';
            } else if (x==-1){
                x++;y++;ord='a';
            }
            total++;
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            PrintLikeSinWave.wavePrint(mat);
            System.out.println();

            t -= 1;
        }
    }
}

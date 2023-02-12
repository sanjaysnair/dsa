package com.array2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintSpiral {
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
    public static void spiralPrint(int matrix[][]){
        if (matrix.length==0 || matrix[0].length==0){
            return;
        }
        int total=0, iter=1;
        int rs=0, re=matrix.length-1, cs=0, ce=matrix[0].length-1;
        while (total<matrix.length*matrix[0].length){
            if (iter==1){
                for (int i=cs;i<=ce;i++){
                    System.out.print(matrix[rs][i]+" ");
                    total++;
                }
                iter++;
                rs++;
            } else if (iter==2){
                for (int i=rs;i<=re;i++){
                    System.out.print(matrix[i][ce]+" ");
                    total++;
                }
                iter++;
                ce--;
            } else if(iter==3){
                for (int i=ce;i>=cs;i--){
                    System.out.println("re="+re+", i="+i);
                    System.out.print(matrix[re][i]+" ");
                    total++;
                }
                iter++;
                re--;
            } else if(iter==4){
                for (int i=re;i>=rs;i--){
                    System.out.println("rs="+rs+", i="+i);
                    System.out.print(matrix[i][cs]+" ");
                    total++;
                }
                cs++;
                iter=1;
            }

            //System.out.println("total="+total);
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            PrintSpiral.spiralPrint(mat);
            System.out.println();

            t -= 1;
        }
    }
}

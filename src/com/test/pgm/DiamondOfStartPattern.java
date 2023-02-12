package com.test.pgm;

import java.util.Scanner;

public class DiamondOfStartPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int n1 = (n+1)/2;
        int i=1;
        while (i<=n1){
            int space = n1-i;
            int star = 2*i-1;
            for(int j=0;j<space;j++){
                System.out.print(' ');
            }
            for (int j=0;j<star;j++){
                System.out.print('*');
            }
            i++;
            System.out.println();
        }

        int n2 = n1-1;
        int k=n2;
        for (int l=k;l>=1;l--){
            int space=n2-l+1;
            int star = 2*l-1;
            for(int j=0;j<space;j++){
                System.out.print(' ');
            }
            for (int j=0;j<star;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

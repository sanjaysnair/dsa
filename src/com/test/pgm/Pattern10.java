package com.test.pgm;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            int sum = 0;
            String str="";
            while (j <= i) {
                str+=j+"+";
                sum+=j;
                j++;
            }
            str=str.substring(0, str.length()-1);
            str+="="+sum;
            System.out.println(str);
            i++;
        }
    }
}

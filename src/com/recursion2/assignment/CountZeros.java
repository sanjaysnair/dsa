package com.recursion2.assignment;

import java.util.Scanner;

public class CountZeros {
    public static int countZerosRec(int input){
        if (input==0){
            return 1;
        }
        if (input==1){
            return 0;
        }
        if (input/10==0){
            return 0;
        }
        int check = countZerosRec(input/10);
        if (input%10==0){
            check++;
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(CountZeros.countZerosRec(n));
    }
}

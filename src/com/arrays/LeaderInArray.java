package com.arrays;

import java.util.Scanner;

public class LeaderInArray {
//    public static void leaders(int[] input) {
//        for (int i=0;i<input.length;i++){
//            boolean isLeader=true;
//            for (int j=i+1;j<input.length;j++){
//                if (input[i]<input[j]){
//                    isLeader=false;
//                }
//            }
//            if (isLeader){
//                System.out.print(input[i]+" ");
//            }
//        }
//
//    }
    public static void leaders(int[] input){
        int[] leaders=new int[input.length];
        int cnt=0;
        int rightMax=input[input.length-1];
        // Rightmost will always be a leader
        System.out.print(rightMax+" ");
        for (int i = input.length-2; i>=0; i--) {
            if(input[i] > rightMax)
            {
                rightMax=input[i];
                System.out.print(" "+rightMax);
                leaders[cnt]=rightMax;
                System.out.print(rightMax+" ");
                cnt++;
            }
        }
        System.out.println();
        for (int j=0;j<leaders.length;j++){
            System.out.println(leaders[j]+" ");
        }
//        for (int i=leaders.length-1;i>=0;i++){
//            if (leaders[i]!=0){
//                System.out.println(leaders[i]);
//            }
//        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = s.nextInt();
        }
        LeaderInArray.leaders(input);
    }
}

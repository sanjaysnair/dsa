package com.recursion;

import java.util.Scanner;

public class IndexOfANumInArray {
    public static int lastIndex(int input[], int x) {
        if (input.length==0){
            return -1;
        }
        if (input[0]==x){
            return 0;
        }
        return firstIndex(input, x, 1);
    }
    public static int firstIndex(int input[], int x, int si) {
        if (si==input.length){
            return -1;
        }
        if (input[si]==x){
            return si;
        }
        return firstIndex(input, x, ++si);
    }
    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = s.nextInt();
        System.out.println(IndexOfANumInArray.lastIndex(input, x));
    }
}

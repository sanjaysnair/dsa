package com.recursion;

import java.util.Scanner;

public class LastIndexOfANumInArray {
    public static int lastIndex(int input[], int x) {
        if (input.length==0){
            return -1;
        }
        int lIndex = lastIndex(input, x, 1);
        if (lIndex!=-1){
            return lIndex;
        } else if (input[0]==x){
            return 0;
        } else {
            return -1;
        }
    }
    public static int lastIndex(int input[], int x, int si) {
        if (si==input.length){
            return -1;
        }
        int prevSi = si;
        int lIndex = lastIndex(input, x, ++si);
        if (lIndex!=-1){
            return lIndex;
        } else if (input[prevSi]==x){
            return prevSi;
        } else {
            return -1;
        }
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
        System.out.println(LastIndexOfANumInArray.lastIndex(input, x));
    }
}

package com.timecomplexity.assignment;

// O(n^2) solution
// improved solution https://www.youtube.com/watch?v=5L9Jrehvoew

public class PairSum {
    public static int pairSum(int[] arr, int num) {
        if (num<=1){
            return 0;
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==num){
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a={1, 1, 1, 1};
        System.out.println(pairSum(a, 2));
    }
}

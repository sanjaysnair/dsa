package com.timecomplexity.assignment;

public class TripletSum {
    public static int tripletSum(int[] arr, int num) {
        if (num<=1){
            return 0;
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==num){
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a={1, 3, 4, 6, 9, 12};
        System.out.println(tripletSum(a, 25));
    }
}

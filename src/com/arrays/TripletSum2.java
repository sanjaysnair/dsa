package com.arrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TripletSum2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");


        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static int tripletSum(int[] arr, int num) {
        if (arr.length<3){
            return 0;
        }

        mergeSort(arr);
        int sum=0;
        for (int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;
            while (j<k){
                int s=arr[i]+arr[j]+arr[k];
                if (s<num){
                    j++;
                } else if (s>num){
                    k--;
                } else {
                    sum++;
                    k--;
                }
            }
        }
        return sum;
    }
    public static void mergeSort(int[] input){
        // recursion base case
        if (input.length==1){
            return;
        }

        int mid = (0 + input.length-1) / 2;

        int si=0;
        int ei=input.length-1;
        int[] a1=new int[mid-si+1];
        int[] a2=new int[ei-1-mid+1];
        int p1=0, p2=0;
        for (int i=si;i<=mid;i++){
            a1[p1]=input[i];
            p1++;
        }
        for (int i=mid+1;i<=ei;i++){
            a2[p2]=input[i];
            p2++;
        }
        mergeSort(a1);
        mergeSort(a2);

        // merge back
        int[] a3 = merge(a1, a2);
        for (int i=0;i<input.length;i++){
            input[i]=a3[i];
        }
    }

    public static int[] merge(int[] a1, int[] a2){
        int[] arr = new int[a1.length+a2.length];
        int p1=0, p2=0, p3=0;
        while (p1<a1.length && p2<a2.length){
            if (a1[p1]<=a2[p2]){
                arr[p3]=a1[p1];
                p1++;
            } else {
                arr[p3]=a2[p2];
                p2++;
            }
            p3++;
        }
        if (p1==a1.length && p2<a2.length){
            for (int i=p2;i<a2.length;i++){
                arr[p3]=a2[i];
                p3++;
            }
        } else if (p2==a2.length && p1<a1.length){
            for (int i=p1;i< a1.length;i++){
                arr[p3]=a1[i];
                p3++;
            }
        }
        return arr;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] arr = takeInput();
            int num = Integer.parseInt(br.readLine().trim());
            System.out.println(TripletSum2.tripletSum(arr, num));

            t -= 1;
        }
    }
}

package com.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumOfTwoArrays {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int power(int n, int p) {
        if (p==0){
            return 1;
        } else {
            return n * power(n,p-1);
        }
    }
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int i=0;
        int j=arr1.length-1;
        int s1=0;
        while (j>=0){
            s1+=arr1[j]*power(10, i);
            j--;
            i++;
        }
        i=0;
        j=arr2.length-1;
        int s2=0;
        while (j>=0){
            s2+=arr2[j]*power(10, i);
            j--;
            i++;
        }
        int sum = s1 + s2;
        for (int k=output.length-1;k>=0;k--){
            output[k] = sum%10;
            sum=sum/10;
        }
        for (int k=0;k<output.length;k++){
            System.out.print(output[k]+" ");
        }
    }
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int[] arr1 = new int[size];
        String[] strNum1 = br.readLine().split("\\s");
        for (int i=0;i<strNum1.length;i++){
            arr1[i]=Integer.parseInt(strNum1[i]);
        }

        int size2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[size2];
        String[] strNum2 = br.readLine().split("\\s");
        for (int i=0;i<strNum2.length;i++){
            arr2[i]=Integer.parseInt(strNum2[i]);
        }
        int outSize = 0;
        if (size > size2) {
            outSize = size + 1;
        } else {
            outSize = size2+1;
        }
        int[] output = new int[outSize];
        sumOfTwoArrays(arr1, arr2, output);
    }
}

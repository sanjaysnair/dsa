package com.sorting;

/*You have been given a random integer array/list(ARR) of size N.
You have been required to push all the zeros that are present in the
array/list to the end of it. Also, make sure to maintain the relative
order of the non-zero elements.*/

public class PushZeroToEnd {
    public static void pushZerosAtEnd(int[] arr) {
        int i = 0, k=0;
        while (i < arr.length) {
            if (arr[i]!=0 && arr[k]!=0) {
                i++;k++;
            } else if (arr[i]==0 && arr[k]==0) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 0, 0, 8, 2};
        pushZerosAtEnd(arr1);

        for (int k=0;k<arr1.length;k++) {
            System.out.print(arr1[k]+" ");
        }
    }
}

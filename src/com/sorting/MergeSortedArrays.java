package com.sorting;

public class MergeSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i=0, j=0, cnt=0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[cnt] = arr1[i];
                i++;
            } else {
                arr3[cnt] = arr2[j];
                j++;
            }
            cnt++;
        }
        while (i<arr1.length) {
            arr3[cnt] = arr1[i];
            i++;
            cnt++;
        }
        while (j<arr2.length) {
            arr3[cnt] = arr2[j];
            j++;
            cnt++;
        }

        return arr3;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,4,8,10,13,17};
        int[] arr2 = {2,3,5,7,9,11,12};
        int[] arr3 = merge(arr1, arr2);

        for (int k=0;k<arr3.length;k++) {
            System.out.print(arr3[k]+" ");
        }
    }
}

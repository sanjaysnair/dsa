package com.timecomplexity.assignment;

public class FindDuplicate1 {
    public static int findDuplicate(int[] arr) {
        if (arr.length==0){
            return -1;
        }
        if (arr.length==1){
            return arr[0];
        }
        quickSort(arr, 0, arr.length-1);
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a={0, 7, 2, 5 ,4, 7, 1, 3, 6};
        System.out.println(findDuplicate(a));
    }
    public static void quickSort(int[] input, int p, int q) {
        if (p < q){
            int c = partition(input, p, q);
            //System.out.println(input[c]);
            quickSort(input, p, c-1);
            quickSort(input, c+1, q);
        }
    }
    public static void swap(int[] a, int i, int j){
        int temp=a[j];
        a[j]=a[i];
        a[i]=temp;
    }
    public static int partition(int[] a, int si, int ei){
        int pivot = si;
        int i=si;
        int j=ei;
        while(i<j){
            if (a[i]<a[pivot]){
                i++;
            } else if (a[j]>=a[pivot]){
                j--;
            } else {
                swap(a, i, j);
            }
        }
        swap(a, j, pivot);
        return pivot;
    }
}

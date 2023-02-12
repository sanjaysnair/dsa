package com.timecomplexity;

import java.util.Random;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] a={6, 9, 8, 5};
        int[] b={9, 2, 4, 1, 8};
        intersection(a, b);
    }
    public static void intersection(int[] arr1, int[] arr2) {
        if (arr1.length==0 && arr2.length==0){
            return;
        }
        quickSort(arr1, 0, arr1.length-1);
        quickSort(arr2, 0, arr2.length-1);

        int searchStartIndex = 0;
        for (int i=0;i<arr1.length;i++){
            int res = binarySearch(arr2, arr1[i], searchStartIndex, arr2.length-1);
            if (res!=-1) {
                boolean back=false;
                while (arr1[i]==arr2[res] && res>0){
                    res--;
                    back=true;
                }
                if (back){
                    System.out.print(arr2[res+1]+" ");
                    searchStartIndex = res+2;
                } else {
                    System.out.print(arr2[res]+" ");
                    searchStartIndex = res+1;
                }
            }
        }
    }
    public static void intersectionBetter(int[] arr1, int[] arr2){
        if (arr1.length==0 && arr2.length==0){
            return;
        }
        if (arr1.length>arr2.length){
            quickSort(arr1, 0, arr1.length-1);
            int searchStartIndex = 0;
            for (int i=0;i<arr2.length;i++){
                //System.out.println("Searching "+arr2[i]);
                //System.out.println("searchStartIndex = "+searchStartIndex);
                int res = binarySearch(arr1, arr2[i], searchStartIndex, arr1.length-1);
                //System.out.println("Result : "+res);
                if (res!=-1) {
                    boolean back=false;
                    while (arr2[i]==arr1[res] && res>0){
                        res--;
                        back=true;
                    }
                    if (back){
                        System.out.print(arr1[res+1]+" ");
                        searchStartIndex = res+2;
                    } else {
                        System.out.print(arr1[res]+" ");
                        searchStartIndex = res+1;
                    }
                }
            }
        } else {
            quickSort(arr2, 0, arr2.length-1);
            int searchStartIndex = 0;
            for (int i=0;i<arr1.length;i++){
                System.out.println("Searching "+arr1[i]);
                System.out.println("searchStartIndex = "+searchStartIndex);
                int res = binarySearch(arr2, arr1[i], searchStartIndex, arr2.length-1);
                System.out.println("Result : "+res);
                if (res!=-1) {
                    boolean back=false;
                    while (arr1[i]==arr2[res] && res>0){
                        res--;
                        back=true;
                    }
                    if (back){
                        System.out.print(arr2[res+1]+" ");
                        searchStartIndex = res+2;
                    } else {
                        System.out.print(arr2[res]+" ");
                        searchStartIndex = res+1;
                    }
                }
            }
        }


    }
    public static void quickSort(int[] a, int si, int ei){
        if (si<ei){
            int c = partition(a, si, ei);
            quickSort(a, si, c-1);
            quickSort(a, c+1, ei);
        }
    }
    public static int partition(int[] arr, int start, int end) {
        int pIndex = new Random().nextInt(end - start) + start;
        int pivot = arr[pIndex];
        swap(arr, pIndex, end);
        pIndex=end;
        while (start < end) {
            while (arr[start] <= pivot && start < end) {
                start++;
            }
            while (arr[end] >= pivot && start < end) {
                end--;
            }
            swap(arr, start, end);
        }
        swap(arr, start, pIndex);
        return start;
    }
    public static void swap(int[] a, int i, int j){
        int temp=a[j];
        a[j]=a[i];
        a[i]=temp;
    }
    public static int binarySearch(int[] a, int x, int start, int end){

        if (start<=end){
            int mid = (start+end)/2;
            if (x==a[mid]){
                return mid;
            } else if (x < a[mid]) {
                return binarySearch(a, x, start, mid-1);
            } else {
                return binarySearch(a, x, mid+1, end);
            }
        }
        return -1;
    }
    public static void print(int[] a){
        for (int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

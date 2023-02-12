package com.binary.search;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 5, 4, 2, 1};
        System.out.println("Mid index is: " + binarySearch(arr));
    }

    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start == end) {
                return mid;
            } else if (arr[mid] > arr[mid+1]) {// Descending part of array
                end = mid;
            } else if (arr[mid] < arr[mid+1]) {// Ascending part of array
                start = mid + 1;
            }
        }
        return -1;
    }
}

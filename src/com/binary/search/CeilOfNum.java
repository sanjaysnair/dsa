package com.binary.search;

public class CeilOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int result = findNumCeil(arr, 15);
        System.out.println(result);
    }

    static int findNumCeil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        if (start <= arr.length - 1) {
            // if ceil is not found return the start, once it is crossed the while loop condition.
            return start;
        }
        return -1;
    }
}

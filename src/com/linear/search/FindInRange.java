package com.linear.search;

public class FindInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(findNumInRange(arr, -7, 1, 3));
    }

    static int findNumInRange(int[] arr, int target, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

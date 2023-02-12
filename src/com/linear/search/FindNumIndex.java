package com.linear.search;

public class FindNumIndex {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = -1;
        int ans = findIndex(nums, target);
        System.out.println(ans);
    }

    static int findIndex(int[] arr, int target) {
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

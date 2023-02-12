  package com.binary.search;
import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 5, 5, 6, 6, 7};
        int target = 6;
        int[] result = searchRange(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = binarySearch(nums, target, 'l');
        ans[1] = binarySearch(nums, target, 'r');
        return ans;
    }

    static int binarySearch(int[] arr, int target, char direction) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] < target) {// right
                start = mid + 1;
            } else if (arr[mid] > target) {//left
                end = mid - 1;
            } else if (arr[mid] == target) {//mid
                ans = mid;
                if (direction == 'l') {// goto the left most element
                    end = mid - 1;
                } else {// goto the right most element
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

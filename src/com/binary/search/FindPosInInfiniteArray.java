package com.binary.search;

public class FindPosInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int target = 22;
        System.out.println(findPosition(arr, target));
    }

    static int findPosition(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (arr[end] < target) {// while target element is in the search range
            //System.out.println("Start = " + start + ", End = " + end);
            int newStart = end + 1;
            if (checkIndex(arr, newStart) == false) {
                return -1;
            }
            end = end + (end-start+1) * 2;
            start = newStart;
            //System.out.println("- Start = " + start + ", End = " + end);
            while (checkIndex(arr, end) == false) {
                if (end > start) {
                    end = end - 1;
                }
            }
        }
        if (checkIndex(arr, start)) {
            return binarySearch(arr, target, start, end);
        }
        return -1;
    }

    static boolean checkIndex(int[] arr, int index) {
        try {
            int i = arr[index];
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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
        return -1;
    }


}

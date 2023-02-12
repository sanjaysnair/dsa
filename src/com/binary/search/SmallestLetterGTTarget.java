package com.binary.search;

public class SmallestLetterGTTarget {
    public static void main(String[] args) {
        char[] arr = {'e', 'e', 'e', 'e', 'n', 'n', 'n'};
        char target = 'n';
        System.out.println(findSmallestChar(arr, target));
    }

    static char findSmallestChar(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}

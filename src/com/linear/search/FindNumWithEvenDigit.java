package com.linear.search;

/*
* Leetcode
* 1295. Find Numbers with Even Number of Digits
* Given an array nums of Strings, return how many of them contain an even number of digits.
* */
public class FindNumWithEvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 10, 111};
        System.out.println(findEvenLenNum(nums));
    }
    static int findEvenLenNum(int[] nums) {
        int cnt = 0;
        for (int num: nums) {
            // solution with while loop
            /*int cnt2 = 0;
            while (num > 0) {
                num = num / 10;
                cnt2++;
            }

            if (cnt2 % 2 == 0) {
                cnt++;
            }*/

            // efficient solution
            if (((int)Math.log10(num) + 1) % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}

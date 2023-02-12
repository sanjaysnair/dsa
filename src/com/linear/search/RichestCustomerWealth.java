package com.linear.search;

/*
* Leetcode
* 1672. Richest Customer Wealth
* */
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1}};

        double maxWealth = 0;
        for (int[] cust: accounts) {
            double custWealth = 0;
            for (int wealth: cust) {
                custWealth += wealth;
            }
            if (custWealth > maxWealth) {
                maxWealth = custWealth;
            }
        }
        System.out.println((int)(maxWealth));
    }
}

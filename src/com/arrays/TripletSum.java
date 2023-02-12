package com.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TripletSum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine());
        int[] input = new int[size];

        if (size==0) {
            return input;
        }
        String[] strNums;
        strNums = br.readLine().split("\\s");

        for (int i=0;i<size;i++) {
            input[i]=Integer.parseInt(strNums[i]);
        }
        return input;
    }

    public static int findTriplet(int arr[], int x) {
        int cnt = 0;
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                for (int k=j+1;k<arr.length;k++) {
                    if (arr[i]+arr[j]+arr[k]==x) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine());
        int cnt=0;
        while (t > 0) {
            int[] input = takeInput();
            int x = Integer.parseInt(br.readLine());
            int ans = findTriplet(input, x);
            System.out.println(ans);
            t-=1;
            cnt++;
        }
    }
}

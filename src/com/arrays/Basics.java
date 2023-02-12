package com.arrays;

public class Basics {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 10;
        arr[5] = 50;
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i]+"-");
        }
        System.out.println();
        char[] arr2 = new char[10];
        double[] arr3 = new double[10];
        boolean[] arr4 = new boolean[10];

        for (int i=0; i< 10; i++) {
            System.out.print(arr2[i]+"-");
        }
        System.out.println();
        for (int i=0; i< 10; i++) {
            System.out.print(arr3[i]+"-");
        }
        System.out.println();
        for (int i=0; i< 10; i++) {
            System.out.print(arr4[i]+"-");
        }
        System.out.println();
        int arr5[] = new int[5];
        arr5[1] = 10;
        arr5 = new int[2];
        System.out.println(arr5[0]);
    }
}

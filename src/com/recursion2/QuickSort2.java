package com.recursion2;

public class QuickSort2 {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        // your code goes here
        if (endIndex-startIndex<=0) return;
        int pe = input[startIndex];
        int count = 0;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (input[i] < pe) count++;
        }
        int partition =startIndex+count;
        swap(input,partition,startIndex);
        int i=startIndex,j=partition+1;
        while (i<partition && j<=endIndex){
            if (input[i]<input[partition]) i++;
            else if (input[j]>=input[partition]) j++;
            else swap(input,i++,j++);
        }
        quickSort(input,startIndex,partition-1);
        quickSort(input,partition+1,endIndex);

    }

    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }
    public static void main(String[] args) {
        int[] input = {1138, 3340, 442, 3752, 2639, 4312, 1, 3525, 223};
        QuickSort2.quickSort(input);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}

package com.timecomplexity.assignment;

public class UniqueElement {
    public static int findUnique(int[] arr) {
        //System.out.println(arr[arr.length-1]);
        if (arr.length>1){
            qsort(arr, 0, arr.length-1);
        }
        // for (int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        return findUnique(arr, 0, arr.length-1);
    }
    public static int findUnique(int[] a, int s, int e) {
        //System.out.println(e-s);
        if  (a.length==0){
            return 0;
        }
        if (a.length==1){
            return a[0];
        }
        if (e-s<0){
            return 0;
        } else if (e-s==0){
            return a[s];
        } else if (a[s]!=a[s+1]) {
            return a[s];
        } else if (e-s>1){
            return findUnique(a, s+2, e);
        }
        return 0;
    }
    public static void qsort(int[] a, int s, int e){
        if (s<e){
            int c=partition(a, s, e);
            //System.out.println("pivot index="+c);
            //System.out.println("pivot element="+a[c]);
            qsort(a, s, c-1);
            qsort(a, c+1, e);
        }
    }
    public static int partition(int[] a, int s, int e){
        int pivot = s;
        s = s+1;
        while (s<e){
            if (a[s]<a[pivot]){
                s++;
            } else if (a[e]>a[pivot]){
                e--;
            } else {
                int temp = a[e];
                a[e]=a[s];
                a[s]=temp;
            }
        }
        int temp = a[e];
        a[e]=a[pivot];
        a[pivot]=temp;
        return e;
    }
    public static int find(int[] a){
        int xor=0;
        for (int i=0;i<a.length;i++){
            xor = xor ^ a[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        System.out.println(1^3^1^3^6^6^7^10^7);
        int[] arr={1, 3, 1, 3, 6, 6, 7, 10, 7};
        System.out.println(findUnique(arr));//using sorting O(n logn)
        System.out.println(find(arr));//using xor - O(n)
        System.out.println(0^7^2^5^4^7^1^3^6);
        System.out.println(0|7|2|5|4|7|1|3|6);
        System.out.println(0^7^2^5^4^7^1^3^6^0^7^2^5^4^7^1^3^6^6);
    }
}

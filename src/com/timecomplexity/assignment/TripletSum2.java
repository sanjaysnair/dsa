package com.timecomplexity.assignment;

import java.util.Arrays;

public class TripletSum2 {
    public static int tripletSum(int[] arr, int num) {
        /*if (arr.length<3){
            return 0;
        }*/

       Arrays.sort(arr);
        int sum=0;
        for (int i=0;i<arr.length-1;i++){
            int j=i+1;
            int k=arr.length-1;
            while (j<k){
                int s=arr[i]+arr[j]+arr[k];
                if (s==num){
                    System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+s);
                    sum++;
                    j++;
                    k--;
                } else if (s<num){
                    j++;
                } else {
                    k--;
                }
            }
        }
        return sum;
        /*int n = arr.length;
		Arrays.sort(arr);
		int npair = 0;
        for(int i =0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{

                    if((arr[i]+arr[j]+arr[k])==num)
                    {
                        npair = npair+1;

                    }
			    }
		    }
		}
		return npair;*/
    }


    public static void print(int[] a){
        for (int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a={2, -5, 8, -6, 0, 5, 10, 11, -3};
        System.out.println(tripletSum(a, 10));
    }
}

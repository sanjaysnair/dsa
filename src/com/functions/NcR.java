package com.functions;

import java.util.Scanner;

public class NcR {

    public static int fact(int n) {
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int factN = fact(n);

        int factR = fact(r);

        int factNR = fact(n-r);

        int result = factN / (factR * factNR);
        System.out.println(result);
    }
}

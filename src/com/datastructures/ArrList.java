package com.datastructures;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(1, 200);

        System.out.println(arr.size());
        System.out.println(arr.get(1));

        ArrayList<String> list = new ArrayList<String>() ;
        list.add( "apple" );
        list.add( "banana" );
        list.add( "carrot" );
        list.add( 0, "mango" );
        list.set(2, "pineapple");
        System.out.println(list.get(2));
    }
}

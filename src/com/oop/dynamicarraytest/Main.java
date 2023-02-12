package com.oop.dynamicarraytest;

public class Main {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(10);
        da.add(20);
        da.add(30);
        da.add(40);
        da.add(50);
        da.add(60);
        da.add(70);
        da.add(80);
        da.add(90);
        da.add(100);
        da.set(0, 11);
        da.add(110);
        da.add(120);
        da.add(130);
        da.add(140);
        da.add(150);
        da.add(160);
        da.add(170);
        da.add(180);
        da.add(190);
        da.add(200);
        da.add(210);
        da.set(20, 211);
        for (int i=0;i<da.len;i++){
            System.out.println(i+":"+da.get(i));
        }
        System.out.println("Size="+da.size());
    }
}

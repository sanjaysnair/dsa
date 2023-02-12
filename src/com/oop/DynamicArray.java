package com.oop;

public class DynamicArray {
    private int[] arr;
    int len;
    public DynamicArray(){
        arr = new int[10];
        len = 0;
    }
    public int size(){
        return len;
    }
    public boolean isEmpty(){
        return len==0;
    }
    public int get(int i){
//        if (i>=size()){
//            resize();
//        }
        return arr[i];
    }
    public void add(int element){
        if (len==arr.length-1){
            resize();
        }
        int temp = arr[len];
        arr[len]=element;
        if (temp!=0) {
            len++;
        }
    }
    private void resize(){
        int[] arrNew = new int[arr.length*2];
        for (int i=0;i<=arr.length;i++){
            arrNew[i] = arr[i];
        }
        arr = arrNew;
    }
    public void set(int i, int element){
        if (i>arr.length-1){
            resize();
        }
        arr[i] = element;
        len++;
    }
    public int removeLast(){
        if (len==0){
            return -1;
        }
        int temp = arr[len-1];
        len--;
        return temp;
    }
}

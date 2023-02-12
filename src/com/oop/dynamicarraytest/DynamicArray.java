package com.oop.dynamicarraytest;

class DynamicArray {

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

    public int get(int index){
        if (index >= len){
            return -1;
        }
        return arr[index];
    }

    public void add(int element){
        if (len==arr.length){
            resize();
        }
        arr[len]=element;
        len++;
    }

    public void set(int index, int element){
        if (index >= len){
            return;
        }
        arr[index] = element;
    }

    private void resize(){
        int[] arrNew = new int[arr.length*2];
        for (int i=0;i<arr.length;i++){
            arrNew[i] = arr[i];
        }
        arr = arrNew;
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


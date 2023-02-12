package com.oop.genericspkg.boundgeneric;

import com.oop.genericspkg.boundgeneric.Vehicle;

public class Print {
    public static<T extends PrintInterface> void printArray(T arr[]){
        for (int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
            arr[i].print();
        }
    }

    public static void main(String[] args) {
        Vehicle v[]=new Vehicle[5];
        for (int i=0;i<v.length;i++){
            v[i]=new Vehicle(160, "Honda");
        }
        printArray(v);

        Student s[]=new Student[5];
        for (int i=0;i<s.length;i++){
            s[i]=new Student(i+1);
        }
        printArray(s);
    }
}

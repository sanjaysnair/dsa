package com.oop;

class Test6{
    static int marks;
    void set_marks(int marks)
    {
        this.marks=marks;               //Line 1
    }
}
class TestStatic1 {
    public static void main (String[] args) {
        Test6 t=new Test6();
        t.set_marks(78);                //Line 2
        System.out.print(Test6.marks);   //Line 3
    }
}

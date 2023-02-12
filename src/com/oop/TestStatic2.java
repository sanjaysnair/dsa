package com.oop;

class Test7
{
    static int a = 10;
    static int b;
    static void fun(){
        b = a * 4;
    }
}
class TestStatic2{
    public static void main(String[] args)
    {
        Test7 t=new Test7();
        t.fun();
        System.out.print(Test7.a+Test7.b);
    }
}

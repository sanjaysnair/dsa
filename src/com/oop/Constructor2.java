package com.oop;

class Test5
{
    int a;
    int b;
    Test5()
    {
        this(10, 20);
        System.out.print("constructor one ");
    }
    Test5(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.print("constructor two ");
    }
}
class Constructor2{
    public static void main(String[] args)
    {
        Test5 object = new Test5();
    }
}

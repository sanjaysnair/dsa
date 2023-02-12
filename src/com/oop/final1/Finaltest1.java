package com.oop.final1;

abstract class A {
    int i;
    abstract void display();
}
class B extends A {
    int j;
    void display() {
        System.out.println(j);
    }
}
class Finaltest1 {
    public static void main(String args[])
    {
        B obj = new B();
        obj.j=2;
        obj.display();
    }
}


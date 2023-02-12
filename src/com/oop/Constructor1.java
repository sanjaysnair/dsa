package com.oop;

class Ninja
{
    Ninja(String name)
    {
        System.out.println("Constructor one " + name);
    }
    Ninja(String name, int age)
    {
        System.out.println("Constructor two " + name + " "+ age);
    }
    Ninja(long id)
    {
        System.out.println("Constructor three " + id);
    }
}

class Constructor1
{
    public static void main(String[] args)
    {
        Ninja geek3 = new Ninja("Dharmesh", 26);
    }
}

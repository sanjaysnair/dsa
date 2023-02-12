package com.oop;

class Mobile{
    private int year;
    String company_name;
}
class Test3 {
    public static void main (String[] args) {
        Mobile c=new Mobile();
        //c.year=2018;
        c.company_name="Apple";
        System.out.println(c.company_name);
    }
}

package com.strings;

public class StringMemory {
    public static void test4(){
        String str1="abc";
        String str2="";
        System.out.println(str1.contains(str2));
    }
    public static void test3(){
        String str1="abc";
        String str2=str1+" ";
        System.out.println(str1==str2);
    }
    public static void test2() {
        String str1="abc";
        String str2="bc";
        String str3="ab"+str2;
        System.out.println(str1==str3);
    }
    public static void main(String[] args) {
        String str1="abc";
        String str2=new String("abc");
        System.out.println(str1==str2);

        String str3="abc";
        String str4=new String("abc");
        System.out.println(str3.equals(str4));

        test2();
        System.out.print("test3->");
        test3();
        System.out.print("test4->");
        test4();
    }
}

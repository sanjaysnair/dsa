package com.strings;

public class Str1 {
    public static void main(String[] args) {
//        String a ="abcd";
//        String b="abcda";
//        System.out.println(a.compareTo(b));

        String a="coding",b="ninjas";
        if(a.contains("ing"))
        {
            a+=b;
        }
        else
        {
            b+="ing";
        }
        System.out.println(b+a);

        String name="Sanjay";
        System.out.println(name.substring(6));

        String a1="coding";
        for(int i=2;i<4;i++)
        {
            System.out.print(a1.substring(i));
        }
        System.out.println();

        String a2="coding";
        for(int i=2;i<5;i++)
        {
            System.out.print(a2.substring(i-2,i+1));
        }
    }
}

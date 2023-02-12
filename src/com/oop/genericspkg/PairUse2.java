package com.oop.genericspkg;

public class PairUse2 {
    public static void main(String[] args) {
        Pair<String, Integer> pInner = new Pair<>("Sanjay", 37);
        Pair<Pair<String, Integer>, String> pS=new Pair<>(pInner, "Nair");
        System.out.println("Str1="+pS.getFirst().getFirst()+
                ", Str2="+pS.getSecond()+
                ", age="+pS.getFirst().getSecond());

        Pair<Integer, Double> pID=new Pair<Integer, Double>(5, 3.14);
        System.out.println("Int="+pID.getFirst()+", Double="+pID.getSecond());
    }
}

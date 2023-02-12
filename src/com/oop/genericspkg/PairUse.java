package com.oop.genericspkg;

public class PairUse {
    public static void main(String[] args) {
        Pair<String, String> pS=new Pair<String, String>("aa", "bb");
        System.out.println("Str1="+pS.getFirst()+", Str2="+pS.getSecond());

        Pair<Integer, Double> pID=new Pair<Integer, Double>(5, 3.14);
        System.out.println("Int="+pID.getFirst()+", Double="+pID.getSecond());
    }
}

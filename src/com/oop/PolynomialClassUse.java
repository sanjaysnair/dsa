package com.oop;

import java.util.*;


public class PolynomialClassUse{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        PolynomialClass p1=new PolynomialClass();
        p1.set(2,1);
        p1.set(3,2);
        p1.set(6,4);
        p1.print();
        PolynomialClass p2=new PolynomialClass();
        p2.set(4,3);
        p2.set(2,1);
        p2.print();
        System.out.println("Addition Of Two Polynomials\n"+p1.add(p2));
    }
}
class PolynomialClass{
    DynamicArrayNew Coeff;

    public PolynomialClass(){
        Coeff=new DynamicArrayNew();
    }
    public void set(int degree,int coeff){
        Coeff.set(degree,coeff);
    }
    public String add(PolynomialClass p2){
        String result="";
        int i=0,j=0;
        for(i=0;i<this.Coeff.size() && i<p2.Coeff.size();i++){
            if(this.Coeff.get(i)==0 && p2.Coeff.get(i)==0)
                continue;
            result+=(this.Coeff.get(i)+p2.Coeff.get(i))+"X^"+i+"  ";
        }
        while(i<this.Coeff.size()){
            if(this.Coeff.get(i)==0){
                i++;
                continue;
            }
            result+=this.Coeff.get(i)+"X^"+i+"  ";
            i++;
        }
        j=this.Coeff.size();
        while(j<p2.Coeff.size()){
            if(p2.Coeff.get(j)==0){
                j++;
                continue;
            }
            result+=p2.Coeff.get(i)+"X^"+i+"  ";
            j++;
        }
        return result;
    }

    public void print(){
        String result="";
        for(int i=0;i<Coeff.size();i++){
            if(this.Coeff.get(i)==0)
                continue;
            result+=Coeff.get(i)+"X^"+i+"  ";
        }
        System.out.println(result);
    }
}


class DynamicArrayNew{
    int []arr;
    int nextIndex;
    public DynamicArrayNew(){
        arr=new int[5];
    }
    public void set(int index, int num){
        if(index>=arr.length){
            doubleCapacity();
        }
        arr[index]=num;
    }
    public void doubleCapacity(){
        int temp[]=arr;
        arr=new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
    }
    public int size(){
        return arr.length;
    }
    public int get(int i){
        if(i>arr.length)
            return -1;
        return arr[i];
    }
}




package com.oop.polynomialtest;

public class Polynomial {
    DynamicArray da;
    int highestDegree=0;
    public Polynomial(){
        da = new DynamicArray();
    }
    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coeff){
        da.set(degree, coeff);
        da.len++;
        if (degree>highestDegree){
            highestDegree=degree;
        }
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for (int i=0;i<da.size();i++){
            if (da.get(i)!=0) {
                System.out.print(da.get(i) + "x" + i + " ");
            }
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        Polynomial newPoly = new Polynomial();
        int i=0, j=0;
        for (i=0;i<da.size() && i<p.da.size();i++){
            if (da.get(i)==0 && p.da.get(i)==0){
                continue;
            }
            newPoly.setCoefficient(i, da.get(i) + p.da.get(i));
        }
        while (i<=da.size()){
            if (da.get(i)==0){
                i++;
                continue;
            }
            newPoly.setCoefficient(i, da.get(i));
            i++;
        }
        j = da.size();
        while (j<p.da.size()){
            if (p.da.get(j)==0){
                j++;
                continue;
            }
            newPoly.setCoefficient(j, p.da.get(j));
            j++;
        }
        return newPoly;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        Polynomial newPoly = new Polynomial();
        int iter;
        if (highestDegree>p.highestDegree){
            iter = highestDegree;
        } else {
            iter = p.highestDegree;
        }
        for (int i=0;i<=iter;i++){
            if (da.get(i)!=0 && p.da.get(i)!=0){
                newPoly.setCoefficient(i, da.get(i) - p.da.get(i));
            } else if (da.get(i)!=0 && p.da.get(i)==0){
                newPoly.setCoefficient(i, da.get(i));
            } else if (da.get(i)==0 && p.da.get(i)!=0){
                newPoly.setCoefficient(i, -p.da.get(i));
            }
        }
        return newPoly;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        Polynomial newPoly = new Polynomial();
        for (int k=0;k<=highestDegree+p.highestDegree+1;k++){
            newPoly.da.add(0);
        }
        for (int i=0;i<=highestDegree;i++){
            for (int j=0;j<=p.highestDegree;j++){
                int degree = i + j;
                int coeff = da.get(i) * p.da.get(j);
                if (coeff>0){
                    if (newPoly.da.get(degree)!=0) {
                        newPoly.setCoefficient(degree, newPoly.da.get(degree) + coeff);
                    } else {
                        newPoly.setCoefficient(degree, coeff);
                    }
                }
            }
        }
        return newPoly;
    }

}

class DynamicArray {

    private int[] arr;
    int len;

    public DynamicArray(){
        arr = new int[100];
        len = 0;
    }

    public int size(){
        return len;
    }

    public boolean isEmpty(){
        return len==0;
    }

    public int get(int index){
        if (index >= arr.length){
            return 0;
        }
        return arr[index];
    }

    public void add(int element){
        if (len==arr.length){
            resize();
        }
        arr[len]=element;
        len++;
    }

    public void set(int index, int element){
        if (index>=arr.length-1){
            resize();
        }
        arr[index] = element;
        if (index>=len){
            len=index+1;
        }
    }

    private void resize(){
        int[] arrNew = new int[arr.length*2];
        for (int i=0;i<arr.length;i++){
            arrNew[i] = arr[i];
        }
        arr = arrNew;
    }

    public int removeLast(){
        if (len==0){
            return -1;
        }
        int temp = arr[len-1];
        len--;
        return temp;
    }
}
package com.oop;

public class Polynomial {

    DynamicArray da;
    int highestDegree=0;
    public Polynomial(){
        da = new DynamicArray();
    }
    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term with specified degree and value is added into the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coeff){
        //System.out.println("Set: degree="+degree+", coeff="+coeff);
        da.set(degree, coeff);
        //print();
        //System.out.println();
        if (degree>highestDegree){
            highestDegree=degree;
        }
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        //System.out.println("print fn."+da.len);
        for (int i=0;i<=highestDegree;i++){
            if (da.get(i)!=0) {
                System.out.print(da.get(i) + "x^" + i + " ");
            }
        }
        System.out.println();
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        Polynomial newPoly = new Polynomial();
        int iter;
        if (highestDegree>p.highestDegree){
            iter = highestDegree;
        } else {
            iter = p.highestDegree;
        }
        for (int i=0;i<=iter;i++){
            if (da.get(i)!=0 && p.da.get(i)!=0){
                newPoly.setCoefficient(i, da.get(i) + p.da.get(i));
            } else if (da.get(i)!=0 && p.da.get(i)==0){
                newPoly.setCoefficient(i, da.get(i));
            } else if (da.get(i)==0 && p.da.get(i)!=0){
                newPoly.setCoefficient(i, p.da.get(i));
            }
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
        System.out.println(da.size()+" : "+p.da.size());
        System.out.println(highestDegree+" : "+p.highestDegree);
        for (int i=0;i<=highestDegree;i++){
            for (int j=0;j<=p.highestDegree;j++){
                int degree = i + j;
                int coeff = da.get(i) * p.da.get(j);
                System.out.println("degree="+degree+", coeff="+coeff);
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

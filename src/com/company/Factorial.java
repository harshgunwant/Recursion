package com.company;

public class Factorial {
    public static void main(String[] args) {
        int c=5;
        System.out.println(fact(c));
    }
    static int fact(int ff){
        // we know 5!=5*4*3*2*1
        //and n!=n*n-1*n-2*n-3*....1;
        //base case
        if(ff<=1) return 1;
        return fact(ff-1)*ff;
        //the above is not tail recursion
    }
}

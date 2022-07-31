package com.company;

public class SpecialFib {
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        //int a=1;

        //int b=2;
        int n=5;

        System.out.println(SpecialFib(n));
    }

    static int SpecialFib(int n){
        int a=1,b=2;
        //base case
        if(n==a || n==b) return n;
        return SpecialFib(n-1) ^ SpecialFib(n-2);

    }
}

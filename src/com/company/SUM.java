package com.company;

public class SUM {
    public static void main(String[] args) {
        int n=9999;
        System.out.println(summ(n));
    }
    static int summ(int e){
        //bse case
        if(e==0) return 0;
        return e+summ(e-1);
    }
}

package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        int c=-12234;
        System.out.println(SumOfD(c));
    }
    static int SumOfD(int g){
        //bse case
        if(g==0) return 0;
        //recurence relation
        return SumOfD(g/10) + g%10;
    }
}

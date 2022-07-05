package com.company;

public class BASICS {
    public static void main(String[] args) {
        //printing numbers from 1 to n.
        int n=5;
        //Doit(n);
        Both(5);
    }
    static void Doit(int b){
        //System.out.println(b); in order to print 1 we can also take the base case from 0.
        //base case
//        if(b==1) return;
        if(b==0) return;
        System.out.println(b);
        Doit(b-1);
    }
    static void DOinR(int b){
        if(b==0) return;
        DOinR(b-1);
        System.out.println(b);
    }
    static void Both(int b){
        if(b==0) return;
        System.out.println(b);
        Both(b-1);
        System.out.println(b);
    }
}

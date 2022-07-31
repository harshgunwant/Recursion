package com.company;

public class GreekOnaci {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Giveme(n));

    }
    static int Giveme(int a){
        //base case
        if(a==0 || a==1 || a==2) return a;
        return Giveme(a-1) + Giveme(a-2) + Giveme(a-3);
    }
}

package com.company;

public class Print1TO0N {
    public static void main(String[] args) {
        int a=5;
        printIt(5);
    }
    static void printIt(int n){
        //base case
        if(n==0) return;

        printIt(n-1);
        System.out.println(n);
    }

}

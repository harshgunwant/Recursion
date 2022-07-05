package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //printing nth fibonacci number
        Scanner obj=new Scanner(System.in);
        System.out.println("which nth position is it?");
        int n= obj.nextInt();
        int ans=fib(n);
        System.out.println(ans);
    }
    static int fib(int n){
        //base case
        if(n==0 || n==1) return n;
        return fib(n-1) + fib(n-2);
    }
}

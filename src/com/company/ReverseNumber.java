package com.company;

public class ReverseNumber {
    public static void main(String[] args) {
        int a=112211;
//        reverseIt(a);
//        System.out.println(sum);
        System.out.println(palindrome(a));
    }
    static int sum=0;   //we can declare this as a global variable here.

    static void reverseIt(int b){
        //base case
        if(b==0) return;

        sum=sum*10+(b%10);
//        return c*10+reverseIt(b/10);
        reverseIt(b/10);
    }

    //2nd way
    static int Rev2(int k){
        int digits=(int)(Math.log10(k)+1);
        return helper(k, digits);
    }
    static int helper(int k, int arg){
        if(k==1) return 1;
        return (k%10)*(int)(Math.pow(10,arg-1)) + helper(k/10, arg-1);
    }

    //palindromeYorN?
    static boolean palindrome(int f){
        return f==Rev2(f);
    }

}

package com.company;

public class CountZeroes {
    public static void main(String[] args) {
        int n = 8008904;
        System.out.println(helper(n));;
    }
    static int helper(int k){
        return Count(k, 0);
    }
    static int Count(int k, int ccount){
        if(k==0) return ccount;
        int rem=k%10;
        if(rem==0) return Count(k/10, ccount+1);
        else return Count(k/10, ccount);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        helper(arr,arr.length);
    }
    static void helper(int[] arr,  int size){
        //base case
        if(arr.length<1) return ;

        int[] numss=new int[size-1];
        for(int i=0;i<arr.length-1;i++){
            int x=arr[i]+arr[i+1];
            numss[i]=x;
        }
        helper(numss, size-1);
        System.out.println(Arrays.toString(arr));
    }
}

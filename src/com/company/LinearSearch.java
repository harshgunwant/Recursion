package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={3,2,1,18,9};
        int target=11;

        System.out.println(IFound1(arr, target,0));
    }

    static boolean IFound(int[] arr1, int k, int start){

        //base case
        if(start==arr1.length) return false;

        return k==arr1[start] || IFound(arr1, k, start+1);   //we can also use preincrement here i.e, ++start.
    }
    static int IFound1(int[] arr1, int k, int start){

        //base case
        if(start==arr1.length) return -1;
        if(k!=arr1[start]) return IFound1(arr1, k, start+1);
        //return k==arr1[start] || IFound(arr1, k, start+1);   //we can also use preincrement here i.e, ++start.
        return start;
    }
}

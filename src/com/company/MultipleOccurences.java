package com.company;

import java.util.ArrayList;

public class MultipleOccurences {
    public static void main(String[] args) {
        int[] arr={3,2,11,11,11,18,9,11};
        int target=11;

        IFoundM(arr, target,0);
        //System.out.println(liss);
    }
    //static ArrayList<Integer> liss=new ArrayList<>();
    static void IFoundM(int[] arr1,int tar, int s){

        //base case
        if(s==arr1.length) return;
        if(tar!=arr1[s]) IFoundM(arr1, tar, s+1);
        //return k==arr1[start] || IFound(arr1, k, start+1);   //we can also use preincrement here i.e, ++start.

        else{
           // liss.add(s);
            IFoundM(arr1, tar, s+1);
        }

    }

}

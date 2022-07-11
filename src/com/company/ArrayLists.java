package com.company;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        int[] arr={3,2,11,11,11,18,2,9,11};
        int target=2;
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        System.out.println(IFoundM(arr,target,0,list));
    }

        static ArrayList<Integer> IFoundM(int[] arr1,int tar, int s, ArrayList<Integer> lists){

            //base case
            if(s==arr1.length) return lists;
            if(tar!=arr1[s]) return IFoundM(arr1, tar, s+1, lists);
                //return k==arr1[start] || IFound(arr1, k, start+1);   //we can also use preincrement here i.e, ++start.

            else{
                lists.add(s);
                return IFoundM(arr1, tar, s+1, lists);
            }

        }
}

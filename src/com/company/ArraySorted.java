package com.company;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr={1,2,33,4,7,8,9};
        System.out.println(Sorted(arr, 0));
    }
    static boolean Sorted(int[] arr1, int s){
        //base case
        if(s==(arr1.length)-1) return true;

        return arr1[s]<=arr1[s+1] && Sorted(arr1, s+1);


    }
}

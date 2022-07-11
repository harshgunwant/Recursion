package com.company;

public class ArrayList {
    public static void main(String[] args) {
        int[] arr={3,2,11,11,11,18,9,11};
        int target=11;
        ArrayList list = new ArrayList();
        System.out.println(IFoundM(arr,target,0,list));
    }

        static ArrayList IFoundM(int[] arr1,int tar, int s, ArrayList lists){

            //base case
            if(s==arr1.length) return lists;
            if(tar!=arr1[s]) IFoundM(arr1, tar, s+1, lists);
                //return k==arr1[start] || IFound(arr1, k, start+1);   //we can also use preincrement here i.e, ++start.

            else{
                lists.add(s);
                IFoundM(arr1, tar, s+1, lists);
            }

        }



}
}

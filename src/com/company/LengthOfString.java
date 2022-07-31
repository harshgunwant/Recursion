package com.company;

public class LengthOfString {
    public static void main(String[] args) {
        String Str="helloworldsdsadk";
        LengthOfString2(Str,0);
    }

    static void LengthOfString2(String str, int pointer){
        //edge case
        if(str.length()==0) System.out.println(0);;

        //base case
        if(pointer==(str.length()-1)){
            System.out.println(pointer+1);
            return;
        }
        pointer++;
        LengthOfString2(str, pointer);
    }
}

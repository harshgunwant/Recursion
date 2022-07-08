package com.company;

public class Q_GFG {
    public static void main(String[] args) {
        String str="geeksorgeeks";
        System.out.println(StrRecurse(str, str.length()-1));
    }
    static char StrRecurse(String str1 , int length1){
        //base case
        if((length1-1)==0) return '0' ;

        if(str1.charAt(length1-1)>='A' && str1.charAt(length1-1)<='Z'){
            return str1.charAt(length1-1);

        }else{
            return StrRecurse(str1, length1-1);
        }
    }
}

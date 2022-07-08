package com.company;

public class ReverseString {
    public static void main(String[] args) {
        char[] v={'H','a','n','n','a','h'};
        int s=0,e=v.length-1;
        RecurseIt(v, s,e);
    }

    static void RecurseIt(char[] ch, int st, int end){
        //bse case
        if(st>=end){
            System.out.println(ch);
            return;
        }
        char temp=ch[st];
        ch[st]=ch[end];
        ch[end]=temp;
        RecurseIt(ch, st+1, end-1);
    }
}

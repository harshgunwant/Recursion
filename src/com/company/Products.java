package com.company;

public class Products {
    public static void main(String[] args) {
        int c = 505;
        System.out.println(SumOfD(c));
    }

    static int SumOfD(int g) {
        //bse case
        if (g == 0) return 1;
        //recurence relation
        return SumOfD(g / 10) * (g % 10);
    }
}

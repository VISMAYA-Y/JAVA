package com.company;

public class associativity_09 {
    public static void main(String[] args) {
        //int a = 6*5-34/2;
        /* =30 - 34/2
           =30 - 17
           = 13
         */
        //System.out.println(a);
        //precedence and associativity
        //quick quiz
        int x = 5;
        int y = 6;
        int k= x * y / 2;
        System.out.println(k);

        int b = 1;
        int a = 5;
        int c = 4;
        int k2 = b * b - (4 * a * c)/(2*a);
        System.out.println(k2);


    }
}

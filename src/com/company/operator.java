package com.company;

public class operator {
    public static void main(String[] args) {
        //arthematic operator
        int b = 5;
        int a = 3+b;
        System.out.println(a);


        //assigment operator
        //int c += 4; is incorrect ok because You cannot declare and use an operator like += in the same line like this.
        int c=2;
         c+=3;
        System.out.println(c);


        //comparision operator
        System.out.println(64>3);


        //logical operaters
        System.out.println(63>2&&3<1);
        System.out.println(63>2||3<1);


        //bitwise operators
        System.out.println(2&3);
//        10
//        11
//     ---------
//        10
    }
}

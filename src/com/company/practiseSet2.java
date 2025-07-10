package com.company;
import java.util.Scanner;

public class practiseSet2 {
    public static void main(String[] args) {
        /*What will be the result of the following expression:
        float a = 7/4 * 9/2*/
//        float a = 7/4.0f *9/2.0f;
//        System.out.println(a);


        /*Write a java program to encrypt a grade by adding 8 to it.
         Decrypt it to show the correct grade.*/
//        char grade = 'B';
//        grade = (char)(grade + 8);
//        System.out.println(grade);


        /* 1) Use comparison operators to find out whether a given number is greater than the user entered number or not.
          2) Write the following expression in a java program:
          (v^2-u^2)/2as
          3) Find the value of 'a' in expression given below :
          int x = 7
          int a = 7*49/7 + 35/7  */
        Scanner sc = new Scanner(System.in);
        int x = 7;
        System.out.println(x>10);
        int v = 2;
        int u = 2;
        int a = 7*49/7 + 35/7;
        int s = 2;
        int k = (v^2-u^2)/2*a*s;
        System.out.println(k);



    }
}

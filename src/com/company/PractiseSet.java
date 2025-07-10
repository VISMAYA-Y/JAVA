package com.company;

import java.util.Scanner;

public class PractiseSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write a Java program to convert kilometers to miles
//        System.out.print("Enter distance in kilometers: ");
//        double km = sc.nextDouble();
//        double mil = km*0.621371;
//        System.out.println(km + "kilo=" + mil + "mil");


        //Write a Java program to detect whether a number entered by the user is integer or not
        System.out.println("Enter a number to check if it's an integer:");

        if (sc.hasNextInt()) {
            int intie = sc.nextInt();  // safe to read now
            System.out.println("Yes, it is an integer: " + intie);
        } else {
            System.out.println("No, it's not an integer.");
        }
    }
}


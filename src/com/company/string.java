package com.company;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String lol = new String("vismaya");
        System.out.println(lol);
        String name = new String("wow");
        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter v1:");
       name = sc.nextLine();  // Gets the full line
        System.out.println("enter v2: ");
        float v2 = sc.nextFloat();
        System.out.printf("dolu says = %s\n", name);
        System.out.printf(" bolu says = %10.2f", v2);


    }
}

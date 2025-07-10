package com.company;
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
      int age ;
        System.out.println("this scan will let you know if u can drink only age 18 and 40 can hahaa🍺");
        System.out.println("enter the age :\n");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you cannot drink!\n");
                break;

            case 21:
                System.out.println("you can drink!\n");
                break;
            case 40:
                System.out.println("obvii sirr !!!");
                break;
            default:
                System.out.println("u cant bish get the fuck out  ");
        }
        System.out.println("must sentence not case ");

    }
}

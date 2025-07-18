package com.company;
import java.util.Scanner;
public class ch_8_oops {
    int id;
    String name;
    String salary;
    public void takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextLine();

        sc.close();
    }

    public void print_detail() {

        System.out.println("my id is: " + id);
        System.out.println("my name is : " + name);

    }
    public void salary(){
        System.out.println("my salary is : " + salary);
    }

    public static void main(String[] args)
    {

        ch_8_oops object = new ch_8_oops();
        object.takeInput();
        object.print_detail();
        object.salary();

    }
}

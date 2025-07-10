package com.company;

public class Main {
    //entry point into application
    //void = no return
    //public = access modifier , here it means class method can be accessed anywhere
    //static = without object we can run
    public static void main(String[] args) {
System.out.println("the sum of these numbers are: ");
       int num1 =1 ;
       int num2 = 2;
       int num3 =3;
       int sum = num1 + num2 + num3;
System.out.println(sum);
    }
}


/* notes:
class name= capital first word & subsequent char(PascalConvention)
function n variable = first word is lowercase and next word 1st letter upper(camelCaseConvention)
basic structure of java = function + classes */
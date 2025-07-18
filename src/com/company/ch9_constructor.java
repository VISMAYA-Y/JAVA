package com.company;


class CWH{
    //default constructor
    CWH(){
        System.out.println("this is default contructor\n");
    }

   // ✅ Parameterized Constructor
   CWH(String s, int b) {
       System.out.println("This is the " + b + "th video of " + s);
   }
}

//🔷 Constructor Overloading
class Employe {
    Employe(String s, int i) {
        System.out.println(s + " - ID: " + i);
    }

    Employe(String s, int i, int salary) {
        System.out.println(s + " - ID: " + i + " - Salary: " + salary);
    }
}

public class ch9_constructor {
    public static void main(String[] args) {
        CWH obj = new CWH();
        Employe obj2 = new Employe("VISMAYA",20000000);
        Employe obj3 = new Employe("v",1);
    }


}
//NOTE:
/*Constructor = Object Creator
Method = Object Worker

class Dog {
    Dog() {  // 🔥 Constructor: no return type, same as class name
        System.out.println("Dog is born!");
    }

    void bark() {  // 🐶 Method: has return type, any name
        System.out.println("Woof!");
    }
}
*/
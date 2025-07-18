package com.company;

class C1{

    C1(){//----->this with no parameter called from child class
        System.out.println("hello vismaya");

    }
    C1(int a , int b){
        int c = a+b;
        System.out.println(c);

    }
    void method1(){
        System.out.println("calling method1\n");
    }
    void method2(){
        System.out.println("calling method2");
    }
}


class C2 extends C1{
        C2(){
            super(10,20);
            System.out.println("child class constructor\n");
        }
    void method2(){
        System.out.println("hi im override wala of method1\n");
    }
    void method3(){
        System.out.println("im method3 i was not in super class");
    }
}
public class ch10_ci {
    public static void main(String[] args) {
        //dynamic method dispatch-used for polymorphism in java
        C1 object = new C2();// you cannot call multiple parameter it like how we do normally so we need superrrrrr rangaa
        object.method1();
        object.method2();
//        object.method3();--> even tho its there inn superclass

//        C2 object2 = new C1();--> CHILD CANT CALL PARENT (it can call grandchild)

    }
}

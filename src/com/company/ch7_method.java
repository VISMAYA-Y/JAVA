package com.company;

//METHODS IN JAVA
public class ch7_method {
    //our main method is static if we wanna call method ,method should be static too
    public static int logic(int a , int b){
        int z;
        if(a>b){
            z= (a+b)*3;
        }else{
            z= (a+b);
        }
        System.out.println("love you haha"+z);
        return z;
    }
    //java: Ay boss… I can’t touch this method from main() unless you create an object of this class.
    public int logic2(int x , int y ) {
        int c;
        if(x>y){
            c= (x+y)*2;
        }else{
            c= (x+y);
        }
        System.out.println("hate u hhaha "+c);
        return c;
    }

    public static void main(String[] args) {
    int a = 4;
    int b = 2;
    int c;
    c= logic(a,b);
        System.out.println("using logic function addition of a,b = "+c);


//java: You wanna do something non-static? You better create an object, bro.

    ch7_method obj = new ch7_method();
    int x= 3;
    int y = 2;
    // if u do println(obj) java doesn’t know how to print your object, so it just gives you: ClassName@memoryAddressInHex
    int lol = obj.logic2(x,y);
        System.out.println("unnieeeeee" +lol);
    }
}

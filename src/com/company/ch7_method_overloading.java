package com.company;

public class ch7_method_overloading {
    static void telljoke(){
        System.out.println("after all that shits btw them they are still together who are the? "+ "my ass cheeks😝");
    }
    //use same name method for different scenerios !
    void Hello(){
        System.out.println("hello bhai kyase hooo \n");
    }
    void Hello(String name){
        System.out.println(name+ " hello brooooo\n");
    }
    void Hello(String name, int age ){
        System.out.println(name+ " hello yaaar tum "+age+ " saal ki hoonaa?" );
    }
//Varargs = Ek aisi method jisme tu kitne bhi inputs bhej sakta hai, bina alag method banaye.
    //void methodName(type... variableName)
    public static int bobo(int... marks){
        int sum =0;
        for(int e : marks){
            sum = sum + e;

        }
return sum;
    }

   void bubu(int... marks) {
       int sum = 0;
       for (int e : marks) {
           sum = sum + e;

       }
       System.out.println(sum+"hehehehehe");
   }

    public static void main(String[] args) {
        telljoke();
        ch7_method_overloading lolo = new ch7_method_overloading();
        lolo.Hello();
        lolo.Hello("vismaya");
        lolo.Hello("vismaya", 20);
        int a = 10;
        int b = 23;
        int c = 90;
        int d;
        d = bobo(a,b,c);
        System.out.println(d);
        lolo.bubu(20,69,57,77);

    }
}

/*
📌 static vs public static vs private static (Java Summary)
👉 static = no object needed
👉 public = visible to all
👉 private = visible only inside same class
*/


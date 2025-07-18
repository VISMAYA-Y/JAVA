package com.company;

public class ch7_recusion {
    //RECURSION - call itself

    static void pn(int n ){
        if(n>0){
            pn(n-1);
            System.out.println(n);
        }
    }
    static void rpn(int n){
        if(n>0){
            System.out.println(n);
            rpn(n-1);
        }
    }
    //quick quizz
//factorial(n) = n * factorial(n-1)
// factorial(n) = n * n-1 *....1
// factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    static int factorial(int n ){
        if(n==0||n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
// iterative approach example
    static int factorial_iterative(int n ){
        if(n==0||n==1){
            return 1;
        }else{
            int product = 1;
            //if it xly by 0 full o error alva so int i =1(ab tu kisi cheez ke andar “position”
            // access karta hai, like array, string, list — tab i = index or else normal number see down note)
            for(int i =1 ; i<=n;i++){
                product *= n;
            }
            return product;
        }

    }

    public static void main(String[] args) {
        pn(4);
        System.out.println("\n");
        rpn(6);
        int x= 5;
        int b ;
        b=factorial(x);
        System.out.println(b);
        System.out.println("our factorial iterative is " +factorial_iterative(4));
    }
}

//NOTESSSSSSSSSSSSSSSSSSS
/*
1. pn(4)
└── calls pn(3)
    └── calls pn(2)
        └── calls pn(1)
            └── calls pn(0) → STOP


2. 📌 i ka role – Computer ka dimaag kya sochta hai:

Tum kya likhte ho        → Computer kya sochta hai
----------------------------------------------------
arr[i]                   → i = index (array access)
charAt(i)                → i = index (string access)
i * i                    → i = value (normal calculation)
sum += i                 → i = value


3. Agar tu method se kuch value chahiye, toh void mat use kar.
Agar tu sirf kaam karwana hai, result nahi chahiye, toh void best.
*/

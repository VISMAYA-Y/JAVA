package com.company;

public class ps5 {
    public static void main(String[] args) {
        //question 1
        int n = 5;

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // print stars in the same line
            }
            System.out.println(); // move to next line after row
        }
//
//        //question 2
//        int sum =0;
//        for(int i =0; i<n ; i ++){
//            // sum = 0+ 2(1) = 2 , sum = 2 + 2(2) = 6 , sum = 6+ 2(3) = 12
//            sum = sum + (2*i);
//            System.out.println(sum);
//        }
//
////        // question 3
//        for(int i = 0; i<=10; i++){
//            //	println prints the text and moves to a new line automatically.
//            //	printf allows formatted output but doesn’t add a newline unless you specify \n.
//            System.out.printf("%d x %d = %d\n", n , i,n*i);
//        }
//        //question 4
//        for(int i = 10; i>=1; i--){
//
//            System.out.printf("%d x %d = %d\n", n , i,n*i);
//        }
        // question 5
        // What is factorial n = n * n-1 * n-2 ..... 1
       // 5! = 5*4*3*2*1 = 120
//        i = 1 → factorial = 1 * 1 = 1
//        i = 2 → factorial = 1 * 2 = 2
//        i = 3 → factorial = 2 * 3 = 6
//        i = 4 → factorial = 6 * 4 = 24
//        int i = 1;
//        int factorial = 1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

//        // question  6
//        for(int i = 0; i<n; i ++){
//            System.out.println("5");
//        }
//        //question 7 same as 6
//        // question 8 - yes true just diff way to write loops
//        //question 9
//        int sum = 0;
//        int n = 8;
//        for(int i = 0; i<=10; i ++){
//            sum += n*i;
//          //System.out.println(sum);
//        }
//        System.out.println(sum);
//
//        for (int i = 0; i < 2; i++) {
//            System.out.println(2);
//        }
    }
}
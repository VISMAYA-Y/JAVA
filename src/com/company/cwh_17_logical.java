package com.company;

public class cwh_17_logical {
    public static void main(String[] args) {
        //relational operators in java
        /* for AND
            0X0=0
            0X1=0
            1X0=0
            1X1=1
        */
        boolean a = true;
        boolean b = false;
//        if (a && b ){
//            System.out.println("Yes with 'AND");
//        }else{
//            System.out.println("No with 'AND'");
//        }

        /*for OR
          0 + 0 = 0
          0 + 1 = 1
          1 + 0 = 1
          1 + 1 = 1
         */
        if(a || b){
            System.out.println("YES WITH OR");
        }else{
            System.out.println("NO WITH OR");
        }

        System.out.println("for Logical NOT\n");
        System.out.println("NOT(a) is :\n");
    }
}

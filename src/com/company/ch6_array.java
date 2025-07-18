package com.company;

public class ch6_array {
    public static void main(String[] args) {
//        //seperate marks &memory allocation
//        int[] marks; //declaration
//        marks =  new int[5]; //memory allocation
//          marks[0] = 2;
//        //declare+mem alloc
//        int[] marks = int[5];
        //declare+mem alloc+init
        int[] marks = {2,3,4,5,6};

        //marks.length = till last element
        for(int i = 0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
       // Array length = number of items
        //Array index = starts from 0 up to length - 1
        for(int i= marks.length-1; i>=0; i-- ){
            System.out.println(marks[i]);
        }

        //displaying very naive
        System.out.println(marks[0]);

        //for-each loop
        for(int bob : marks){
            System.out.println(bob);
        }

        //2-D array
//        int[][] flats = new int[2][3];
//        flats[0][0] = 100;
//        flats[0][1] = 200;
        int[][] flats = {{100,200,300}
                , {400,522,633},
                {844,944,105} };
        System.out.println(flats[0][0]);
        int sum =0;
        //we should use nested loop
        for (int i =0; i<flats.length;i++ ){
            for(int j=0; j<flats[i].length; j++) {
                sum += flats[i][j];
            }
        }
        System.out.println(sum);


    }



}

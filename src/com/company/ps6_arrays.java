package com.company;

public class ps6_arrays {
    public static void main(String[] args) {
        //q2
        int[][] lulu= new int[2][3];
        lulu[0][0] = 100;
        lulu[0][1] = 200;
        lulu[0][2] = 500;
        lulu[1][0] = 300;
        lulu[1][1] = 400;
        lulu[1][2] = 600;

       int find = 300;
       boolean eediya = false;
       for(int[] row : lulu){
            for(int value : row){
                if(find==value){
                    eediya = true;
                    break;
                }
            }
       }
        System.out.println(eediya);

       //q4
        int sum =0;
        for(int[] row : lulu){
            for(int value : row){
                sum = sum + value;
            }
        }
        System.out.println("sum of matrix " +sum);

       //q3
       int[] marks ={90, 80, 33, 49, 90};

       for(int element : marks){
           sum = sum + element;

       }
        int avg_marks;
        avg_marks= sum/lulu.length;
        System.out.println("the value of sum is = "+sum);
        System.out.println("avg marks = "+avg_marks);

        //q5
        System.out.println("in reverse order: \n");
        for (int i = marks.length-1 ; i> 0; i--){

            System.out.println(marks[i]);
        }

        //q6
        int[] arr = { 20,21,22,23};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int e :arr){
            if(e>max){
                max = e;
            }
        }
        System.out.printf("max element in the array is : "+ max);

        //q7
        for(int e: arr){
            if(e<min){
                min=e;
            }
        }
        // interesting imagination: print thingy is like striaght line processing can cut anywhere use \n😱
        System.out.println("\nminimum element "+min);

        //q8
        boolean sortedeediya = false;
        int[] array = {60,30,12,2,100,1290};
        //for each = only value
        //for =  index + value
        for(int i =0; i<array.length-1; i++){
            if(array[i]> array[i+1]){
                sortedeediya = false;
                break;
            }
        }

        if(sortedeediya){
            System.out.println("sorteddd maagaa ");
        }else{
            System.out.println("\nno maga not sorted");
        }
    }
}

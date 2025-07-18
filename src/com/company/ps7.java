package com.company;
public class ps7 {
    // q1
    public static void multi_table(int n){
        for(int i =1; i<=10; i++){
            int c = i*n;
            System.out.println(n +"x"+i+ "="+i*n);
        }
    }

    //q2
    void seeda_stars(int n ){
        for(int i =1; i<=n;i++){
            for(int j=1; j<= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //q3
    static int sum_n(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + sum_n(n-1);
        }
    }

    //q4
    static void ulta_stars(int n ){
        for(int i =n; i>=1;i--){
            for(int j=1; j<= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//q5
    static int fibo(int n ){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fibo(n-1);
        }

    }
// q6
static float avg(int... nums ){
       float sum=0;
       for(int e: nums){
           sum += e;

       }
       float avg = sum/nums.length;
       return avg;

}

//q7
    static void ulta_stars_rec(int n ){
        if(n>0){
            //(n - 1) first so that smaller stars get printed first 🔄
            //Going down the stairs → nothing happens
            //Coming back up → printing stars(notes down)

            for(int i=n; i>0;i--){
                System.out.print("*");
            }
            System.out.println();
            ulta_stars_rec(n-1);
        }
    }

//q8
static void seeda_stars_rec(int n ){
 if(n>0){
     //(n - 1) first so that smaller stars get printed first 🔄
    //Going down the stairs → nothing happens
     //Coming back up → printing stars(notes down)
     seeda_stars_rec(n-1);
     for(int i=0; i<n;i++){
         System.out.print("*");
     }
     System.out.println();
 }
}
//q10
static int sum(int n ) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum += i;
        }
        return sum;

    }
}
    static double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }
    public static void main(String[] args) {
        multi_table(5);
        ps7 starry = new ps7();
        starry.seeda_stars(7);

        System.out.println(sum_n(5)+"sum of just recursion\n");
        ulta_stars(5);
        System.out.println(fibo(3));
        System.out.println(avg(2,2,2,4,2,4));
        System.out.println("recursion starss\n");
        seeda_stars_rec(5);
        System.out.println();
        System.out.println("recursion starss 2\n");
        ulta_stars_rec(7);
        System.out.println(sum(5)+"sum of iterative recursion");

        //celsius --> fah

        double n=25;

        double F = (n * 9.0/5.0)+ 32;
        System.out.println(F);

        System.out.println(celsiusToFahrenheit(25));
    }


}


//NOTES
/*Use i < n
❌ Don’t use i <= n
If n = 1, you only want to print 1 star, not 2!*/
package com.company;
import java.util.Scanner;
import java.util.Random;
public class ps4 {
    public static void main(String[] args) {
        //question 2 :
//        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
//        System.out.println("marks 1 wt ? \n");
//        m1 = sc.nextByte();
//        System.out.println("marks 2 wt ? \n");
//        m2 = sc.nextByte();
//        System.out.println("marks 3 wt ? \n");
//        m3 = sc.nextByte();
//        float avg = m1+m2+m3/3.0f;
//        System.out.println("ypur overall percentage : "+avg);
//        if(m1>=33 && m2>=33 && m3>=33 && avg>=40){
//            System.out.println("congrats babyyy 🤩");
//        }else{
//            System.out.println("baby sorry not sorry 💀");
//        }

        //question 3 :
//        float tax = 0;
//        float income;
//        System.out.println("so lets see how much tax y'll need to pay 🤡 \n wts ur income babe(in l)?\n");
//        income = sc.nextFloat();
//
//        if(income<2.5){
//            tax = tax +0;
//            System.out.println("no tax for u darloo");
//        }else if(income>=2.5 && income<=5.0){
//            System.out.println("babe pay us 5% tax aste mwhaa");
//        }else if(income>=5.0 && income<=10.0) {
//            System.out.println(" pay us 20% tax hehe");
//        }else{
//            System.out.println("30% tax !!! 10l+ rich ppl 💵");
//        }

        // question 4:
//         int day ;
//        System.out.println("wts the number of this day !!!(enter the  day )");
//        day = sc.nextInt();
//
//        switch(day){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5-> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//
//        }

        // question 5 :
//        int year_enter ;
//        System.out.println("enter the year lets see if its leap year or no \n:");
//        year_enter = sc.nextInt();
//        if((year_enter%4)==0 && (year_enter%100)!=0 || (year_enter %400)==0 ){
//            System.out.println("its fucking leap yearrrr waohhhh feb 29th ");
//        }else System.out.println("no lol its not feb 28th ");

        //question 6 :
//        String url;
//        System.out.println("paste the url below will find out wt kinda website u choose :\n");
//        url = sc.next();
//        if (url.endsWith(".com")){
//            System.out.println("commercial website 🌎");
//        }else if ( url.endsWith(".org")){
//            System.out.println("organization");
//        }else if (url.endsWith(".in")){
//            System.out.println("indian website hehe");
//        }

        // do u know we can assign a random number to variable by something called random ! import karna imp hai
        Random r = new Random();
        int a = r.nextInt();
        System.out.println(a);
    }
}

package com.company;

public class PractiseSet3 {
    public static void main(String[] args) {
        //problem 1
        String str = "VISMAYA";
        str = str.toLowerCase();
        System.out.println(str);

        //problem 2
        String name = " vismaya y ";
        name = name.replace(" ","_");
        System.out.println(name);

        //problem 3
        String letter = "Dear <|name|> , thanks a lot!!";
        letter = letter.replace("<|name|>","BABE");
        System.out.println(letter);

        //problem 4
        String DT = "vissu  (double)   tripple";
        System.out.println(DT.indexOf("  "));
        System.out.println(DT.indexOf("   "));

        //problem 5
        String message = "Dear baby,\n\t i just wanna let you know  \n\t\t\t your so beautiful \n\t\t\t\t bye love you ~~~~~";
        System.out.println(message);
    }
}

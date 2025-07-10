package com.company;

public class StringMethod {
    public static void main(String[] args) {
        String name = "vismaya y";
        System.out.println(name);

        // for finding the length of string
        int lenname = name.length();
        System.out.println(lenname);

        //my name ko lower aur upper case bananeke liye
        String Upname = name.toUpperCase();
        System.out.println(Upname);

        String lowname= name.toLowerCase();
        System.out.println(lowname);

        //to trim my name
        String trim = name.trim();
        System.out.println(trim);

        // let's count again after trim
        int lenname2 = trim.length();
        System.out.println(lenname2);

        // substring = jab mujhe only any choti part of my name needed !!
        String substr = name.substring(4);
        System.out.println(substr);
        String substr2 = name.substring(0,3);
        System.out.printf("my nick name is %s\n", substr2);

        //to replace any letter in my name
        String replace = name.replace('s','p');
        System.out.println(replace);

        // is it true my name starts with vi ? 🤡
        Boolean isittrue = name.startsWith("vi");
        System.out.println(isittrue);
        // is it true my name ends with ya ? 🤡
        Boolean isitfalse = name.endsWith("y");
        System.out.println(isitfalse);
        char ch = name.charAt(0);
        System.out.printf("character at 0 index is: %c\n", ch);
        int wtindex = name.indexOf("a");
        System.out.printf("index at 2 is : %d\n", wtindex );

        int lastindex = name.lastIndexOf("a");
        System.out.printf("the last index of a appear in my name 'vismaya':%d\n" , lastindex);
    }
}

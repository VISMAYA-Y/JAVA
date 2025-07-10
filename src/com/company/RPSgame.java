package com.company;

import java.util.Scanner;


public class RPSgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose 1(rock) or 2(paper) or 3(scissor)\n");
        int user = sc.nextInt();
        //math.random-selects value btw (0-1.0 not including 1.0) then *ly by 3 = 0-3.0(not including 3.0) converts
        //0,1,2 then add +1 for getting human no (1,2,3)
        int computer = (int)(Math.random() *3)+1;

        //showing choices
        System.out.println("You chose: " + getChoice(user));
        System.out.println("Computer chose: " + getChoice(computer));

        if (user==computer){
            System.out.println("draw!!!!!");
        }
        else if ((user == 1 && computer==3) ||
                (user == 2 && computer ==1) ||
                (user == 3 && computer ==2)) {
            System.out.println("ME WINNNNNNN HEHEHHEHE");
        }
        else System.out.println("compuuu winnnnnnn haaaaaa");
        }

    // converting no - words
    public static String getChoice(int num){
    if (num==1) return "rock";
    else if (num == 2) return " paper ";
    else if (num == 3 ) return " scissor";
    else return " invalid";
    }
}

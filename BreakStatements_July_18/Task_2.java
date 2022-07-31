package BreakStatements_July_18;

import java.util.Scanner;

public class Task_2 {


//- Write a code where user is asked to enter a string
//- create a new string with entered string but do not include 'L' 'M', 'T' 'E' in the new string
//- print the new string

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String");

        String word=input.nextLine();
        String newword="";
        for (int i = 0; i <word.length() ; i++) {

            if(word.charAt(i) == 'L' || word.charAt(i)=='M' || word.charAt(i)=='T' || word.charAt(i)=='E'){
                continue;
            }
            newword= newword + word.charAt(i);
        }
        System.out.println(newword);

    }
}

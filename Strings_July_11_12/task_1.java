package Strings_July_11_12;

import java.sql.SQLOutput;
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
//Write a code where user is asked to enter a Name,
//if the name start with “A” and ends with “L”,  Replace “A” with “B”and print the result
//If Name Start with “B” and ends with “L” also Contains “A” replace the second character of the name with “G”
//If name starts with “C” and ends with “K” , Check is the name is equal to “Clark” or “CLARK”.


    Scanner input = new Scanner(System.in) ;

        System.out.println("Please Enter Your Name : ");
                String name = input.nextLine();
                if (name.startsWith("A") && name.endsWith("L")){
                System.out.println( name.replaceFirst("A", "B"));
                }

                if (name.startsWith("B") && name.endsWith("L")) {
                } if (name.contains("A")) {
                System.out.println(name.replace(name.charAt(1), 'G' ) );

                }

                if (name.startsWith("C") && name.endsWith("K")){
                } if (name.equals("Clark") || name.equals("CLARK")) {

                System.out.println(name+ " is Clark");

                }else {
                System.out.println(name+ " is not Clark or CLARK");
                }


                }
                }
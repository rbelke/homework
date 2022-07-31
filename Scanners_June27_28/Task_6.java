package Scanners_June27_28;
import java.util.Scanner;
public class Task_6 {

//Write a program where User is being asked to enter the first name, and last name
// and print the full name on the console based on given information.

    public static void main(String[] args) {

        System.out.println("To create a ninetendo account, enter your first name");
        Scanner input1 = new Scanner(System.in);
        String name1 = input1.next();
        //System.out.println("First name is: "+name1);
        System.out.println("Please Enter Last Name");
        Scanner input2 = new Scanner(System.in);
        String name2 = input2.next();
        String Fullname = name1.concat(" "+name2);
        System.out.println("The name your Nintendo account is register under is: " +Fullname);
    }
}
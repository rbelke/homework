package Scanners_June27_28;
import java.util.Scanner;
public class Task_3 {

//Write a code where user is being asked to
// enter a number and based on the entered number print the number is positive, negative or zero

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("To continue, Enter number");
        int number = Scanner.nextInt();

        if (number > 0) {
            System.out.println("number= " + "Positive");
        } else if (number < 0)
        {
            System.out.println("number= " + "Negative");
        }else{
            System.out.println("number is \'0\'");
        }
    }
}

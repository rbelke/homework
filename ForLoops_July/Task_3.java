package ForLoops_July;
import java.util.Scanner;
public class Task_3 {

//Write a code where the user is asked to enter a number.
//Find the sum of all the even numbers between 0 to that number (included)
//Find the sum of all the odd numbers between 0 to that number (included)

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number ");

        int num = input.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else if (i % 2 != 0) {
                oddSum += i;
            }
        }

        System.out.println(" the sum of the even numbers is " + evenSum);
        System.out.println(" the sum of the odd number is " + oddSum);
    }
}

// I struggled with this one a lot so I learned from Ali Ceyhan's submission
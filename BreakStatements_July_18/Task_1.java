package BreakStatements_July_18;
import java.util.Scanner;
public class Task_1 {

//Write a code where user is asked to enter a integer number
//- print all the numbers that can NOT be divided
// by 2, or 5 and Also can be divided by 7 between
// 1 to entered number(included) (use the Continue Statement)
//the integer entered by the user is stored in a variable and printed on the screen.

public static void main(String[] args) {


    System.out.println("Please enter a number");
    Scanner sc = new Scanner(System.in);
    int factNumber = sc.nextInt();
    int result = 1;
    for (int j = 1; j <= factNumber; j++) {
        result *= j;
    }
    System.out.println(factNumber + "!=" + result);

}
}
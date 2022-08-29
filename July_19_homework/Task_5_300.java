package July_19_homework;
import java.util.Scanner;
public class Task_5_300 {

    //Write a code where the the user is asked to enter an integer number
//- sum of all the odd numbers between 1 to given number (included) but exclude the 9,11,23,35 from the total sum if those numbers happens to be in the range of 1 to given number.
//- The sum should not exceed 300

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Odd number: ");
        int num = scanner.nextInt();
        int sum = 1;

        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                if (i == 9 || i == 11 || i == 23 || i == 35) {
                    continue;
                }else{
                    System.out.print(i + " , ");}
            }if (sum + i < 300) {
                sum += i;}
        }System.out.println("\nThe sum of Odd numbers is:  ("+ sum+")");
    }
}
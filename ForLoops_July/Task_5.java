package ForLoops_July;
import java.util.Scanner;
public class Task_5 {
//Write a code where user is asked to enter a number:
//Calculate the square of all the numbers from 0 to
// given number and print the result for each number,
// (square of a number is number*number == > 5*5 = 25 or 6*6 = 36

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int number=scan.nextInt();

        for (int i=0;i<=number;i++){
            System.out.println(i+"*"+i+" = "+i*i);
        }
}
}
//I looked at Huseyin's code to help me fix my errors
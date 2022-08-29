package July_19_homework;
import java.util.Scanner;
public class Task_6_input {


    //Write a code where it ask user to enter an integer number
//- Reverse the given number and print the result
//- Example input ( 5678 )
//- Example output ( 8765 )

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scan.nextInt();
        int reverse=0;
        int num;
        while (number>0){
            num=number%10;
            number=number/10;
            reverse=(reverse*10)+num;
        }
        System.out.println("reverse = " + reverse);
    }
}
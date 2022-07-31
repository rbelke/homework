package Scanners_June27_28;
import java.util.Scanner;
public class Task_2 {

//Write a code where User is being asked for the first number,
// second number and third number. Then Compare those number print the maximum number.

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in) ;

        int number1 ;
        int number2 ;
        int number3 ;

        String result ;


        System.out.println("Enter first number");
        number1 = Scanner.nextInt() ;
        System.out.println("Enter second number");
        number2 = Scanner.nextInt() ;
        System.out.println("Enter third number");
        number3 = Scanner.nextInt();

        if (number1>number2 && number1>number3) {

            System.out.println(number1 + " is maximum number " );



        }else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is maximum number " );


        }else{

            System.out.println(  result = number3 + " is maximum number " );
        }


    }
}
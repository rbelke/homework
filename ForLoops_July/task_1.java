package ForLoops_July;
import java.util.Scanner;
public class task_1 {

//Write a code where user is asked to enter an integer number:
// 1) Using the given number, find the factorial of that number and Print the result.
    // The factorial function (symbol: !)
    // says to multiply all whole numbers from our chosen number down to 1. Examples: 4! = 4 × 3 × 2 × 1 ...
//example: 5 ==> 5! = 5*4*3*2*1 = 120

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scan.nextInt();
        int result=1;
        for (number=number;number>0;number--){
            result=number*result;

        }
        System.out.println("result = " + result);

    }
}
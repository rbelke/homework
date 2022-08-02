package ForLoops_July;
import java.util.Scanner;
public class Task_2 {
//Write a code where user is asked to enter a number and check for every number between 0 to that number
// to see how many number between 0 to that number can be divided to 3 and 5 and sum all
// those number, Print the result

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number ");
        int num= input.nextInt();
        //nextInt() The nextInt() method of a Scanner object reads in a string of digits (characters)
        // and converts them into an int type. The Scanner object reads the characters one by one until
        // it has collected those that are used for one integer. Then it converts them into a 32-bit numeric value.

        int sum=0;
        //It is to initialize the sum parameter to start with 0 and to add to it the number in the array.
        for (int i = 0; i <=num; i++) {
        //That's a loop that says, okay, for every time that i is smaller than 8, I'm going to do whatever is in the code block.
            //Whenever i reaches 8, it will stop. After each iteration of the loop, it increments i by 1 (i++), so that the loop
            // will eventually stop when it meets the i < 8 (i becomes 8, so no longer is smaller than) condition.
            if(i%3==0 && i%5==0){
                //The modulo (%) operator calculates the remainder of a division operation.
                // In this case, it calculates the remainder of i divided by 2.
                sum=sum+i;
                System.out.print(i+" ");
            }
        }
        System.out.println("\n"+"sum of the numbers are :"+sum);

    }
}
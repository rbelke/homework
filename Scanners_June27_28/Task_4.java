package Scanners_June27_28;
import java.util.Scanner;
public class Task_4 {
  public static void main(String[] args) {


//Write a Revenue program, Where user enters the quantity of the
// products sold and  the price for each product.
// Then Calculate he revenue based on giving information (hint: Revenue = quantity x price)

    {
      Scanner input = new
              Scanner(System.in);
      System.out.println("What is the Quantity of the products sold?");
      int quantity = input.nextInt();

      System.out.println("How much were those items sold for? Please exclude sales tax.");
      double price = input.nextDouble();

      double revenue = quantity * price;
      System.out.println (revenue);


    }
  }
}
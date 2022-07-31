package IfElseStatements_June23_24;

public class TipCalculator {

   public static void main(String[] args) {

       //JAVA: tip calculator if-else
       //// Tip Calculator  [if-else]
       //Mark wants to build a very simple tip calculator for whenever he goes to eat in a restaurant.
       //In his country, it's usual to tip 15% if the bill value is between 99 and 280.
       //If the value is different, the tip is 20%.
       //Print as the string to the console containing the bill value, the tip, and the final value (bill + tip).
       //
       //Example: "The bill was 275, the tip was 41.25, and the total value 316.25
       //Data to test 97 ,100, 275 , 25

       double bill = 82;
       double tip15 = bill * 0.15;
       double tip20 = bill * 0.20;
       double total1 = bill + tip15;
       double total2 = bill + tip20;

       if (bill > 99 && bill < 280) {
           System.out.println("The Bill was \t$" + bill + ",\tthe Tip was $" + String.format("%.2f", tip15) + ", \tand the Total value is $" + total1);

       } else if (bill > 0 && bill < 99) {
           System.out.println("The Bill was $" + bill + ",\tthe Tip was $" + String.format("%.2f", tip20) + ", \tand the Total value is $" + total2);

       }

   }

}
package Scanners_June27_28;
import java.util.Scanner;
public class ChallengeQuestion {

 //Challenge Question:
//Write a program Where user is being ask to select items from the list you presented for instance:
//Select 1 for Shirt
//Select 2 for pants
//select 3 for dress
//select 4 for hat
//select 5 for shoes
//User will select select one item each time and until users has 3 items.
//shirt price is = 40
//pants price is = 60
//dress price is = 100
//hat price is = 10
//shoes price is = 120
//if user total amount is more than 200, user will receive 20% off on the total price (
//
//if user total amount is more than 150, user will receive 15% off on the total  price (edited)
//6:27
//if user total amount is more than 100, user will receive 5% off on the total price
//
//your job is to Use the topics we learnt and calculate the Users Total amount after
// User select 3 items and print it.
//
//P.S I will not accept anything we did not learn. Just Scanners, If-else or switch ,
// logical operations and arithmetic operations.

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How many shirt would you like to select ? ");
        int shirtnumber=input.nextInt();
        System.out.println("How many pants t would you like to buy ? ");
        int pantsnumber=input.nextInt();
        System.out.println("How many dress would you like to buy ? ");
        int dressnumber=input.nextInt();
        System.out.println("How many hat would you like to buy ? ");
        int hatnumber=input.nextInt();
        System.out.println("How many shoes would you like to buy ? ");
        int shoesnumber=input.nextInt();

        int shirt=40;
        int pants=60;
        int dress=100;
        int hat=10;
        int shoes=120;

        int totalAmount=(shirt*shirtnumber)+(pants*pantsnumber)+(dress*dressnumber)+(hat*hatnumber)+(shoes*shoesnumber);
        System.out.println(totalAmount);

        int lastprice=0;
        if (totalAmount>100&&totalAmount<=150){
            lastprice= totalAmount/100*95;
        }else if (totalAmount>150&&totalAmount<=200){
            lastprice=totalAmount/100*85;
        } else if (totalAmount>200) {
            lastprice=totalAmount/100*80;
        }else {
            lastprice=totalAmount;
        }

        System.out.println("Your Amount is "+lastprice);
    }
}

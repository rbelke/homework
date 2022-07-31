package Scanners_June27_28;
import java.util.Scanner;
public class TelephoneBill {
    //Telephone Bill
//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for the next 50 calls.
//Plus Rs. 0.50 per call for the next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.
    public static void main(String[] args) {
        int calls = 100;
        double bill1 = 200;
        double bill2 = bill1 + (calls - 100) * 0.6;
        double bill3 = bill2 + (calls - 150) * 0.5;
        double bill4 = bill3 + (calls - 200) * 0.4;

        if (calls <= 100) {

            System.out.println("Your bill is =" + bill1);
        } else if (calls > 100 && calls <= 150) {
            System.out.println("Your bill is =" + bill2);
        } else if (calls > 150 && calls <= 200) {
            System.out.println("Your bill is =" + bill3);
        } else
            System.out.println("Your bill is =" + bill4);
    }
}


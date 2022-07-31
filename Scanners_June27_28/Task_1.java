package Scanners_June27_28;
import java.util.Scanner;
public class Task_1 {

    public static void main(String[] args) {
////task   1:   create   a   java   program   that   will   check   if   number   is   divisible   by   2   and   5   same   time
////task   2:   write	java   program   to   find   the   largest   among   three   numbers.   1)   Using   if-else..if
////task   3:   create   Program   to   check   whether   the   given   number   is   positive   or   negative
////  	→   If   a   number   is   greater   than   zero   then   it   is   a   positive   number
////          	→   If   a   number   is   less   than   zero   then   it   is   a   negative   number
////          	→   If   a   number   is   equal   to   zero   then   it   is   neither   negative   nor   positive.

////task   1
        int number = 100;
        if (number %2==0 && number %5==0){
            System.out.println("Number is divisible by two and five "+number);
        }else {
            System.out.println("Number is not divisible by two and five"+number);
        }
        int number1 = 21;
        int number2 =20;
        int number3 = 2;
////task   2
        if (number1>number2 && number1>number3){
            System.out.println("This is the largest number:"+number1);
        }else if (number2>number1 && number2>number3){
            System.out.println("This is the largest number:"+number2);}else {
            System.out.println("This is the largest number");}
////task   3
        int Number4 = 100;
        if (Number4==0){
            System.out.println("This number is neither positive nor negative:"+Number4);
        }else if (Number4>0){
            System.out.println("This is a positive number"+Number4);
        }else {
            System.out.println("This is a negative number"+Number4 );
        }
    }
}
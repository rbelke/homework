package August_6;

public class Homework_27 {
    public static void main(String[] args) {
//We have two monkeys,   a   and b,   and the parameters aSmile and bSmile indicate if each is smiling.
//We are in trouble if they are both smiling or if neither of them is smiling.   Return true if we are in
//trouble.
//monkeyTrouble(true,   true)   →   true
//monkeyTrouble(false,   false)   →   true
//monkeyTrouble(true,   false)   →   false

        public static boolean monkeyTrouble ( boolean aSmile, boolean bSmile){

            if (aSmile == true && bSmile == true) {
                System.out.println("We are in trouble!!!");
            } else if (aSmile != true && bSmile != true) {
                System.out.println("We are in trouble!!!");

            } else {
                System.out.println("We are not in trouble!!!");

            }
            return true;
        }

      //  public static void main (String[]args){
       //     monkeyTrouble(false, false);
       //     monkeyTrouble(false, true);

        }
    }

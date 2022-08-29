package August_6;

public class Homework_28 {
    public static void main(String[] args) {
//Write a method where it takes a String and returns to a String by adding "Not" in front of the String only if It does not have "Not" in front of it already.
//
//ex. a = "CAR'
// notString("Car" )  == > "Not Car"
// notString("Home"). ==> "Not Home"
// notString("Not Home") == > "Home"
        public static void main(String[] args) {
            System.out.println(notString("sick"));
            System.out.println(notString("healthy"));
            System.out.println(notString("Not ok"));
        }
        public static String notString(String word){

            if (word.contains("Not")){
                return word.replace("Not","");
            }else {
                return "Not "+word;
            }
        }
    }


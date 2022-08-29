package August_11;

public class Homework_32b {
}
//Write a Method where it takes String and return ArrayList of All the numbers in the String
//ex: String str = "This234 is ju3st St1in6"
// srrlsit = {2,3,4,3,1,6}
//hint in order to check if Character is a number or not ( boolean check = Character.isDigit(str.charAt(i) )

    public static void main(String[] args) {
        System.out.println("the numbers in the String are: "+numbers("hdgh dfdhb 23hj34 213hj"));

    }
    public static ArrayList<Character> numbers(String str){
        ArrayList<Character> chararr=new ArrayList<>();
        for (int i = 0; i <str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                chararr.add(str.charAt(i));
            }
        }
        return chararr;
    }
}
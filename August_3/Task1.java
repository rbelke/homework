package August_3;

public class Task1 {
//Write a method where it takes 2 strings as a parameter and
// returns true when 2 strings are equal and return false when they are not equal.

    public static void main(String[] args) {

        System.out.println("the condition is: "+test("belke","belke"));
        System.out.println("the condition is: "+test("belke","belke"));
    }
    public static boolean test(String name1,String name2){
        if (name1.equals(name2)){
            return true;
        }else {
            return false;
        }
    }
}

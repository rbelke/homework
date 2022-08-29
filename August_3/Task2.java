package August_3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
//Write a method where it takes array of
// integers and returns the sorted version of that array


        int[] numbers = {2,8,-4,10,41,78,0,30,3};
       for (int i = 0; i < numbers.length; i++) {

           Arrays.sort(numbers);
       }
    System.out.println(Arrays.toString(numbers));
    }
}
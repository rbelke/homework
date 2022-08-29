package August_11;

public class Homework_30 {
}
//Write a method where it takes 2 String arrays and returns to an ArrayList where it contains all of the elements of the Arrays
//arr1   =   {"A",   "B",   "C"};
//arr2   =   {"D",   "E",   "F",   "G"};
//ist   ==>   {"A",   "B",   "C",   "D",   "E",   "F",   "G"}

          import java.myutils.homework30;

    public static ArrayList<String> concat (String[]arr1, String [] arr2){

        int size = arr1.length + arr2.length;
        ArrayList<String> result = new ArrayList<>();

        int i = 0;
        for ( i = 0; i < arr1.length; i++) {
            result.add(i, arr1[i]);
        }
        for (int k = 0; k < arr2.length; k++) {
            int b = i+k;
            result.add((b), arr2[k]);
        }

        return result;
    }

    public static void main(String[] args) {

        String []arr1   =   {"A",   "B",   "C"};
        String []arr2   =   {"D",   "E",   "F",   "G"};

        System.out.println(concat(arr1,arr2));


    }
}
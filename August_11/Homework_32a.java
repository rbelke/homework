package August_11;

public class Homework_32a {
}
//Write methods where it takes the ArrayList of Double
//1) first method returns to max number
//2) second metod returns to min number
//3) third Method prints all element one by one on the same line ( ex = the List is: 100.9, 12.45, 30.46 )

    public static void main(String[] args) {


        ArrayList<Double> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(100.9, 12.45, 30.46));

        System.out.println(Collections.max(arrList));
        System.out.println(Collections.min(arrList));
        System.out.println(arrList);




    }
}
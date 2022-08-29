package August_11;

public class Homework_31 {
}
//Write a Method where it takes an Integer of ArrayList and returns to an Integer ArrayList where it contains only unique numbers
//ex:   list==>   {1,1,2,3,3,4,5,6}
//      uniques   ==>   {2,4,5,6}

    public static void main(String[] args) {
        System.out.println("new arraylist is= "+numbersmethod());
    }
    public static ArrayList<Integer> numbersmethod(){
        Integer [] array={1,1,2,3,3,4,5,6};
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(array));
        System.out.println("arraylist= "+numbers);
        for (int i = 0; i < numbers.size(); i++) {
            int a=numbers.get(i);
            numbers.remove(i);
            if (numbers.contains(a)) {
                numbers.removeAll(Arrays.asList(a));
            }else{
                numbers.add(i,a);
            }
        }
        return numbers;
    }
}
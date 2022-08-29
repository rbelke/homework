package August_14;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_34 {

//Write a Class and Name it Shoes that has following attributes
//1) Brand
//2) Size
//3) Type
//4) Price
//Also has following Methods
//1) SetInfo(): Where it Takes String brand, double size, String Type and double price to Set the attributes
//2) Print(): Where it prints the the value of attributes.
//
//Create 4 different Object (Class Instance) of Shoes Class. and add it to array-list.
//Print all of the Shoe instances that has price over 10,
//Apply discount for those 15% off on the ones that has Price of 50 or over

    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.addAll(Arrays.asList("Rachael","Cem","Appa"));
        System.out.println("Arraylist elemets are: "+words);
        System.out.println("element's you want is: "+name(words,0));

    }
    public static String name(ArrayList<String> str1, Integer index){
        String find=str1.get(index);
        return find;
    }
}
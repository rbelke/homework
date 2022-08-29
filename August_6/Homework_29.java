package August_6;

ppublic class Homework_29 {

//Write a method where it takes 2 String parameters as input and Concatenate them and returns to a string, but also could handle a situation where It takes 2 String and 1 integer value where it only prints the 2 strings by integer value times.
//ex -  ConcatandPrint("FirstName","LastName") it will return ==> FirstNameLastName
//  	 ConcatandPrint("FirstName","LastName", 3) it will print ==> "FirstName" and "Lastname" 3 times.

    public static void main(String[] args) {
        System.out.println("Rachael,Belke=  "+ConcatandPrint("Rachael","Belke"));
        System.out.println("*********************************");
        ConcatandPrint("Rachael","Belke",3);
    }
    public static String ConcatandPrint(String firstname,String lastname){
        return "Your first name is "+firstname+". Your last name is "+lastname;
    }
    public static void ConcatandPrint(String firstname,String lastname,int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Belke,Rachael,3=  "+"Your first name is "+firstname+". Your last name is "+lastname);
        }
    }
}

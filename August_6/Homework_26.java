package August_6;

public class Homework_26 {
    public static void main(String[] args) {
//Write a method that takes the day as an integer such as (1 for Monday, 2 for Tuesday, and so on)
// and it returns a String value indicating "Go To Work" for weekdays and "Go Back to Sleep" weekends. Name your Method as (GotoSleeporWork)

        System.out.println(goToTheMattresses(6));
    }
public static String goToTheMattresses (int number){
        //goToTheMattresses is a phrase from the godfather and is referenced in you got mail.
        String day="";
        String situation="";
        switch (number){
        case 1:day="monday";break;
        case 2:day="tuesday";break;
        case 3:day="wednesday";break;
        case 4:day="thursday";break;
        case 5:day="friday";break;
        case 6:day="saturday";break;
        case 7:day="sunday";break;
default:
        }
        if (number==1||number==2||number==3||number==4||number==5){
        situation="Go To Work";
        }else {
        situation="Go Back to Sleep";
        }
        return "today is "+day+"and I will "+situation;
        }
        }
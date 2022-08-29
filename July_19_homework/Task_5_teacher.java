//package July_19_homework;
//import java.util.Scanner;
//public class Task_5_teacher {
//    public static void main(String[] args) {
//
//        //-Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
////- based on the point the code should automatically determine the grade of Student with the full name of the student
////- This should be done for each student
////- Assuming we do not know how many student are there but your code should still handle this situation
////-  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
////- When the point is between 90 to 100 the grade should be A
////- When the point is between 80 to 90(excluded) the grade should be B
////- When the point is between 70 to 80(excluded) the grade should be C
////- When the point is between 60 to 70 (excluded) the grade should be D
////- When the point is less than 60 the grade should be F
////- Example output (First Name = Ziya Last Name = Yilmaz Grade: A )
//
//
//        System.out.println("enter student's first name:");
//        Scanner input1 = new Scanner(System.in);
//        String firstname = input1.next();
//        Scanner scan;
//        String name = scan.nextLine();
//        System.out.println("enter student's last name");
//        String lastname = scan.nextLine();
//        System.out.println("enter student's grade:");
//        int point = scan.nextInt();
//        String grade = "";
//        while (true) {
//            if (point >= 90 && point <= 100) {
//                grade = "A";
//            } else if (point >= 80 && point < 90) {
//                grade = "B";
//            } else if (point >= 70 && point < 80) {
//                grade = "C";
//            } else if (point >= 60 && point < 70) {
//                grade = "D";
//            } else if (point >= 0 && point < 60) {
//                grade = "F";
//            } else {
//                break;
//            }
//            System.out.println("first name:" + name + " last name:" + lastname + " Grade: " + grade);
//            System.out.println("Enter Student's first name:");
//            name = scan.next();
//            System.out.println("Enter Student's last name");
//            lastname = scan.next();
//            System.out.println("Enter Student's grade:");
//            point = scan.nextInt();
//            System.out.println("executed function");
//        }
//    }
//}
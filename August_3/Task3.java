package August_3;

public class Task3 {

    //write a method where it takes 2 double values and 1 integer value.
// When the integer value is 1 it returns to sum of the 2 double numbers,
// when integer is 2 it returns the subtraction of those 2 double number,
// when integer value is 3 it returns to the multiplication of those 2 double numbers,
// and when the integer value is 4 it returns the division of those 2 double numbers

    public static void main(String[] args) {



        double cals ;
        double  x = 0;
        double y = 0;
        int z = 0;


            double result = 0;

            if (z == 1) {
                result = (x + y);
            } else if (z == 2) {
                result = (x - y);

            } else if (z == 3) {
                result = (x * y);

            } else if (z == 4) {
                result = (x / y);

            }
            System.out.println(result);
            return result;

        }

        }

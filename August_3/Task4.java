package August_3;
import java.util.Arrays;
public class Task4 {

//Write a method where it takes 2 integer arrays as parameters, and returns
// to the an integer array where it includes 2 highest different
// values in the first array and 2 lowest different values in the second array.

        public static void pro (int [] a,int[] b){
            int [] arr3 = new int[4];

            int max1 = a[0];
            int max2 = a[2];
            int min1 = b[3];
            int min2 = b[4];

            for(int i=0;i<a.length;i++){
                if(arr3[0]<=a[i]){
                    // max1=a[i];
                    arr3[0]=a[i];
                    continue;
                }

                if(max2<=a[i]){
                    max2=a[i];
                    arr3[1]=max2;

                }

            }
            for (int min:b){
                if(min1>=min){
                    min1=min;
                    arr3[2]=min1;
                    continue;

                }
                if (min2>=min){
                    min2=min;
                    arr3[3]=min2;

                }
            }
            System.out.println(Arrays.toString(arr3));

        }
        public static void main (String[] args){
            int [] max= {95,2,6,5,87};
            int [] min= {54,8,111,113,14};
            pro(max,min);

        }

    }
// Author Shams Tabrez Mohammad
//https://github.com/shamstabrez16
import java.util.Scanner;

public class MissingNumberProgram {

    public  static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // reading the value from user
        System.out.println("Enter the number of elements (n) ");
        int[] numberSequence= new int[sc.nextInt()];
        System.out.println("Enter  (n-1) elements:  ");
        // sum of n numbers formula (n * (n+1)/2)
        int total = (numberSequence.length*(numberSequence.length+1))/2;
        //if your range is from 0 to n-1 then use below formula
        //int total = (numberSequence.length*(numberSequence.length-1))/2;
        for (int i = 0; i < numberSequence.length-1; i++) {
            // subtracting  entered number from total
            total= total-sc.nextInt();
        }
        // printing the remaining number to determine the missing number
        System.out.println(" missing number is : "+total);





    }
}

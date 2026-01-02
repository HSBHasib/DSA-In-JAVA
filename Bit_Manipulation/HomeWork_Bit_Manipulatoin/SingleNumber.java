package CodeForDSA.Bit_Manipulation.HomeWork_Bit_Manipulatoin;
import java.util.*;

public class SingleNumber {

    public static int singleNumber(int numers[]) {
        int xor = 0;

        for(int i=0; i<numers.length; i++){
            xor  = xor ^ numers[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Input the size of Array
        System.out.print("Enter the size of Array = ");
        int n = sc.nextInt();

        int number[] = new int[n];

        // Input the value of Array
        for(int i=0; i<number.length; i++){
            System.out.print("Enter the value of index " + i +  " = ");
            number[i] = sc.nextInt();
        }
        
        // Print the Provided Array thant in from the User
        System.out.print("Your provided Array is = [ ");
        for(int i=0; i<number.length; i++){
            System.out.print( number[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        // Call the functions for "Print SingleNumber in the Array"
        int singleNum = singleNumber(number);
        System.out.println("Single Number is the Array is = " + singleNum);
        
    }
}

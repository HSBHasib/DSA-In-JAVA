package CodeForDSA.Arrays.Arrays1.inClass_Arrays;
import java.util.*;

public class PairsInArray {

    public static void print_PairsInArray(int number[]) {
        
        int totalNumPairs = 0;
        
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){

                System.out.print("("+number[i] + "," + number[j] + ") ");
                totalNumPairs ++;
            }

            System.out.println();
        }
        System.out.print("Total number of Pairs = " + totalNumPairs);

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

        // Call the functions for "Print Pairs in the Array"
        print_PairsInArray(number);

    }
    
}

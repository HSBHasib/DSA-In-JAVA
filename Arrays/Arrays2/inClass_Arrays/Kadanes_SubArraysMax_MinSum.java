package CodeForDSA.Arrays.Arrays2.inClass_Arrays;
import java.util.*;

public class Kadanes_SubArraysMax_MinSum {

    public static void maxSubArraysSum(int number[]) {
        
        int currSum = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE; 

        for(int i=0; i<number.length; i++){
            
            currSum += number[i];
            if( currSum < 0 ){
                currSum = 0;
            }

            minSum = Math.min(minSum, currSum);
            maxSum = Math.max(maxSum, currSum);


            // if(currSum > max){
            //     max = currSum;
            // }
            // if(currSum < min){
            //     min = currSum;
            // }
        }
        System.out.print("Minimum SubArrays Sum = " + minSum);
        System.out.println(", Maximum SubArrays Sum = " + maxSum);
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

        // Call the functions for "Print SubArrays"
        maxSubArraysSum(number);

    }
    
}


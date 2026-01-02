package CodeForDSA.Arrays.Arrays2.inClass_Arrays;
import java.util.*;

public class BF_SubArraysMax_MinSum {

    public static void maxSubArraysSum(int number[]) {
        
        int totalSubArrays = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            
            for(int j=i; j<number.length; j++){
                int currSum = 0;
            
                for(int k=i; k<=j; k++){
                    System.out.print(number[k] +" ");     
            
                    currSum += number[k];

                    // if(currSum > max){
                    //     max = currSum;
                    // }
                    // if(currSum < min){
                    //     min = currSum;
                    // }

                    min = Math.min(min, currSum);
                    max = Math.max(max, currSum);
                }
                System.out.print("= " + currSum);

                totalSubArrays ++;
                System.out.println();
            }

            System.out.println();

        }
        System.out.print("Minimum Sum = " + min);
        System.out.println(", Maximum Sum = " + max);
        System.out.print("Total SubArrays = " + totalSubArrays);

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


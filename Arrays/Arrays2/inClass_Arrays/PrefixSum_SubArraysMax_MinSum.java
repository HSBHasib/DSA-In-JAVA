package CodeForDSA.Arrays.Arrays2.inClass_Arrays;
import java.util.*;

public class PrefixSum_SubArraysMax_MinSum {

    public static void maxSubArraysSum(int number[]) {
        
        int currSum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0]; 
        // Calculate Prefix Array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                
                    currSum = i == 0 ? prefix[j] :  prefix[j] - prefix[i-1];

                    // if(currSum > max){
                    //     max = currSum;
                    // }
                    // if(currSum < min){
                    //     min = currSum;
                    // }

                    min = Math.min(min, currSum);
                    max = Math.max(max, currSum);
            }
        }
        System.out.print("Minimum SubArrays Sum = " + min);
        System.out.println(", Maximum SubArrays Sum = " + max);
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


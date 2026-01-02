package CodeForDSA.Arrays.Arrays2.HomeWork_Arrays;
import java.util.*;

public class Find_TargetValue {

    public static int findTargetValue(int numbers[], int target){

        int start = 0, end = numbers.length-1;

        while ( start <= end ) {
            
            
            int mid = (start + end)/2;

            // If target value is found at mid
            if( numbers[mid] == target ){
                return mid;

            // Check If the lest half is Sorted
            } else if ( numbers[start] <= numbers[mid] ){

                if( ( target >= numbers[start] ) && ( target <= numbers[mid] ) ){
                    end = mid;
                } else {
                    start = mid + 1;
                }
                
            // Right half is Sorted
            } else {
                
                if( ( mid + 1 <= end ) && ( target >= numbers[mid + 1] ) && ( target <= numbers[end] ) ) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }

        // Target value not Found
        return -1;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the target number = ");
        int target = sc.nextInt();

        int numbers[] = {4,  5, 6, 7, 0, 1, 2};

        int FinalValue = findTargetValue(numbers, target);
        
        if( FinalValue == -1 ){
            System.out.println("Target value not found");
        } else {
            System.out.println("Target value found at Index = " + FinalValue);
        }


        
    }
    
}

package CodeForDSA.Devide_and_Conquer.inClassWork_DC;
import java.util.*;

public class Sorted_and_Rotated_Array {

    public static int sorted_and_Rotated_Array(int arr[], int target, int start, int end) {
        if( start > end ) {
            return -1;
        }

        int mid = start + (end - start)/2;

        // Case Found
        if(arr[mid] == target) {
            return mid;
        }

        // Mid on Line 1
        if( arr[start] <= arr[mid] ) {
            // case a : left
            if( (arr[start] <= target) && (target <= arr[mid]) ) {
                return sorted_and_Rotated_Array(arr, target, start, mid-1);
            } else {
                // case b : right
                return sorted_and_Rotated_Array(arr, target, mid+1, end);
            }

        } else {  // Mid on Line 2

            // case c : right
            if( (arr[mid] <= target) && (target <= arr[end]) ) {
                return sorted_and_Rotated_Array(arr, target, mid+1, end);
            } else {
                // case d : left
                return sorted_and_Rotated_Array(arr, target, start, mid-1);
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an Array = ");
        int sizeArr = sc.nextInt();

        int arr[] = new int[sizeArr];

        // Input for arrays index
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the value for index " + i + " = " );
            arr[i] = sc.nextInt();
        }

        

        int targetIdx = sorted_and_Rotated_Array(arr, 5, 0, arr.length-1);
        System.out.print("Target found at index = " + targetIdx);

    }
}

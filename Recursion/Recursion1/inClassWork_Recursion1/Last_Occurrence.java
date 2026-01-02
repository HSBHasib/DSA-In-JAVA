package CodeForDSA.Recursion.Recursion1.inClassWork_Recursion1;
import java.util.*;

public class Last_Occurrence {

    public static int last_Occurrence(int arr[], int key, int i) {
        if( i == arr.length){
            return -1;
        }

        // One Way to solve this question
        int isFound = last_Occurrence(arr, key, i+1);
        if( isFound != -1 ){
            return isFound;
        }

        // Check with self
        if( arr[i] == key ){
            return i;
        }

        return isFound;
    }


    public static int last_Occurrence2(int arr[], int key, int i) {
        if( i == arr.length){
            return -1;
        }

        // Second Way to solve this question
        int isFound = last_Occurrence(arr, key, i+1);
        if( isFound == -1 && arr[i] == key ){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,4,3,5,2,6,2,7,2,10};
        int foundIndex = last_Occurrence(arr, 2,  0);
        
        System.out.print( foundIndex == -1 ? "Key not found - " : "Key found at index : " + foundIndex);
        
        System.out.println();

        System.out.print( last_Occurrence2(arr, 2, 0) == -1 ? "Key not found - " : "Key found at index : " + last_Occurrence2(arr, 2, 0));

    }    
}

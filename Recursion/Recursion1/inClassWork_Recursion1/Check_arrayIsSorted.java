package CodeForDSA.Recursion.Recursion1.inClassWork_Recursion1;
import java.util.*;

public class Check_arrayIsSorted {

    public static boolean arrayIsSorted(int arr[], int i) { 
        if( i == arr.length-1 ){
            return true;
        }

        if( arr[i] > arr[i+1] ){
            return false;
        }
        
        return ( arrayIsSorted(arr, i+1) );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5};
        boolean isSorted = arrayIsSorted(arr, 0);


        System.out.print( isSorted ? "Array is Sorted - " : "Array is not Sorted - " );
        
        System.out.print("[ ");
        for( int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
}
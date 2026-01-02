package CodeForDSA.Recursion.Recursion1.inClassWork_Recursion1;
import java.util.*;

public class First_Occurrence {

    public static int first_Occurrence(int arr[], int key, int i) {
        if( i == arr.length){
            return -1;
        }

        if( arr[i] == key){
            return i;
        }
        
        return first_Occurrence(arr, key, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5 , 2, 5, 10};
        int foundIndex = first_Occurrence(arr, 5,  0);

        System.out.print( foundIndex == -1 ? "not found - " : "Key found at index : " + foundIndex);

    }
}

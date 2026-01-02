package CodeForDSA.Recursion.Recursoin_HW;
import java.util.*;

public class Find_All_Occurrences {

    public static void find_All_Occurrences(int arr[], int key, int i) {
        if( i == arr.length ) {
            return;
        }

        if( arr[i] == key) {
            System.out.print(i + " ");
        }

        find_All_Occurrences(arr, key, i+1);
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


        // Provided Array Print
        System.out.print("Your Provided is - ");

        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");


        System.out.print("Enter the Key value = ");
        int key = sc.nextInt();

        System.out.println();

        System.out.print("Your given Key value found at index : [ ");
        find_All_Occurrences(arr, key, 0);
        System.out.print("]");

    }
}

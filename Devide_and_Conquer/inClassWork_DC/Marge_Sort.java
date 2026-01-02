package CodeForDSA.Devide_and_Conquer.inClassWork_DC;
import java.util.*;

public class Marge_Sort {

    public static void printArray(int arr[]) {
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        
    }

    public static void margeSort(int arr[], int start, int end) {
        if( start >= end ) {
            return;
        }

        int mid = start + (end - start)/2;
        margeSort(arr, start, mid); // left part
        margeSort(arr, mid+1, end); // right part
        marge(arr, start, mid, end);
    }

    public static void marge(int arr[], int start, int mid, int end) {

        int temp[] = new int[end-start + 1];
        int i = start; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp array

        while ( (i <= mid) && (j <= end) ) {

            if( arr[i] < arr[j] ) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++]; 
        }

        // right part
        while (j <= end) {
            temp[k++] = arr[j++]; 
        }

        // Copy temp arr to Orginal arr
        for(k=0, i=start; k<temp.length; k++, i++) {
            arr[i] = temp[k];
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

        
        // Provided Array Print
        System.out.print("Your Provided Array - ");
        printArray(arr);

        margeSort(arr, 0, arr.length-1);

        // Sorted Array Print
        System.out.print("Sorted Array - ");
        printArray(arr);
    }    
}
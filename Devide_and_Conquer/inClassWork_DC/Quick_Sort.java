package CodeForDSA.Devide_and_Conquer.inClassWork_DC;
import java.util.*;

public class Quick_Sort {

    public static void printArray(int arr[]) {
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        
    }

    public static void quickSort(int arr[], int start, int end) {
        if( start >= end ) {
            return;
        }

        int pIdx = partition(arr, start, end);
        quickSort(arr, start, pIdx-1);
        quickSort(arr, pIdx+1, end);
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start-1; // to make place for elements smaller than pivot

        for(int j=start; j<arr.length; j++) {
            if( arr[j] < pivot ) {
                i++;
                // Swap element
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

            i++;
            // Swap element
            int temp = pivot;
            arr[end] = arr[i];
            arr[i] = temp;
            return i;        
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

        quickSort(arr, 0, arr.length-1);

        // Sorted Array Print
        System.out.print("Sorted Array - ");
        printArray(arr);

    }    
}

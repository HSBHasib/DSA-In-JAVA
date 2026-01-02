package CodeForDSA.Sorting.inClassWork_Sorting;
import java.util.*;

public class SelectionSort {

    public static void selectionSort(int number[]) {
        
        for(int i=0; i<number.length-1; i++) {
            int min_pos = i;
            for(int j=i+1; j<number.length; j++) {

                if( number[min_pos] > number[j]) {
                    min_pos = j;
                }
            }
                // Swap
                int temp = number[min_pos];
                number[min_pos] = number[i];
                number[i] = temp;
        }
    }

    public static void printArray(int number[]) {
        
        System.out.print("Sorted Array is - [ " );

        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }

        System.out.print("]");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array = ");
        int n = sc.nextInt();

        int number[] = new int[n];

        // Input from the user
        for(int i=0; i<number.length; i++){
            System.out.print("Enter the value of index " + i + " = ");
            number[i] = sc.nextInt();
        }

        // Print the given Array user provide
        System.out.print("Your Given Array is - ");
        System.out.print("[ ");
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println("]");

        selectionSort(number);
        printArray(number);

    }
    
}


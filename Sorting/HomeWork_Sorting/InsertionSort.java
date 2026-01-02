package CodeForDSA.Sorting.HomeWork_Sorting;
import java.util.*;

public class InsertionSort {

    public static void insertionSort(int number[]) {
        for(int i=1; i<number.length; i++) {
            int curr = number[i];
            int prev = i-1;
            while ( prev >= 0  && number[prev] < curr) {
                number[prev + 1] =  number[prev];
                prev--;
            }
            number[prev + 1] = curr;
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

        insertionSort(number);
        printArray(number);

    }
}

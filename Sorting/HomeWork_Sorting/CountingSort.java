package CodeForDSA.Sorting.HomeWork_Sorting;
import java.util.*;

public class CountingSort {
    public static void countingSort(int number[]) {
        
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++) {
            largest = Math.max(largest, number[i]);
        }

        int count [] = new int[largest + 1];
        for(int i=0; i<number.length; i++) {
            count[number[i]]++;
        }

        // Sorting
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while ( count[i] > 0 ) {
                number[j] = i;
                j++;
                count[i]--;
            }
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

        countingSort(number);
        printArray(number);

    }
}

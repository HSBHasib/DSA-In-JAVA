package CodeForDSA.Sorting.inClassWork_Sorting;
import java.util.*;

public class BubbleSort {

    public static void bubbleSort(int number[]) {
        
        for(int i=0; i<number.length-1; i++){
            for(int j=0; j<number.length-1-i; j++){

                if( number[j] > number[j+1]){
                    // Swap
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
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

        bubbleSort(number);
        printArray(number);

    }
    
}
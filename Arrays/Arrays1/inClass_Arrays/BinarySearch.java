package CodeForDSA.Arrays.Arrays1.inClass_Arrays;
import java.util.*;

public class BinarySearch {

    public static int binarySearch(int number[], int key) {
        
        int start = 0, end = number.length-1;

        while ( start <= end ) {
            
            int mid = (start + end)/2;

            if( number[mid] == key ){
                return mid;
            }
            
            if ( number[mid] > key ) {   // left searching
                end = mid - 1;
            } else {   // right searching
                start = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter the size of Array = ");
        int n = sc.nextInt();

        int number[] = new int[n];

        for(int i=0; i<number.length; i++){
            System.out.print("Enter the value of index " + i +  " = ");
            number[i] = sc.nextInt();
        }

        System.out.print("Enter the target number that you want to search in Array = ");
        int key = sc.nextInt();


        int keyValue = binarySearch(number, key);

        if( keyValue == -1 ){
            System.out.println("Target number is missing");
        } else {
            System.out.println("Find the target number at index = " + keyValue);
        }
      

    }
    
}




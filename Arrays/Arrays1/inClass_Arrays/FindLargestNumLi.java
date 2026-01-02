package CodeForDSA.Arrays.Arrays1.inClass_Arrays;
import java.util.*;

public class FindLargestNumLi {
    public static int findLargestNum(int number[], int n) {
        
        // Find the Largest number in Array help with "Linear Search"

        int largestNum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            if( number[i] > largestNum ){
                largestNum = number[i];
            }
        }

        return largestNum;
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

        int largestNum = findLargestNum(number, n);
        System.out.println("The largest value in the Array is = " + largestNum);

    }
    
}
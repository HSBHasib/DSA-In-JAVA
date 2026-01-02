package CodeForDSA.Arrays.Arrays1.inClass_Arrays;

import java.util.Scanner;

public class FindLargestNumBi {

    public static void findLargestNum(int number[]) {
        
        // Find the Largest number in Array help with "Binary Search"

        int largestNum = Integer.MIN_VALUE;
        int start = 0, end = number.length-1;
        while ( start <= end ) {
            
            int mid = (start + end)/2;

            if( number[mid] > largestNum ){
                largestNum = number[mid];
            }

        }
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

        // int largestNum = findLargestNum(number);
        // System.out.println("The largest value in the Array is = " + largestNum);

    }
    
}

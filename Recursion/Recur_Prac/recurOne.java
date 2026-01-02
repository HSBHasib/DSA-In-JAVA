package CodeForDSA.Recursion.Recur_Prac;
import java.util.*;

public class recurOne {


    public static void increasingNum_1_to_n(int n) {
        if( n == 1 ){
            System.out.print(n);
            return;
        }

        increasingNum_1_to_n(n-1);
        System.out.print(" " + n);
    }


    public static void decreasingNum(int n) {
        // Base Case
        if( n == 1 ){
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        decreasingNum(n-1);
    }


    public static int factorial_Of_N(int n) {
        if( n == 1 ){
            return 1;
        }

        int fnm1 = factorial_Of_N(n-1);
        return n * fnm1;
    }


    public static int sum_Of_N(int n) {
        if( n == 1 ){
            return 1;
        }

        int snm1 = sum_Of_N(n-1);
        return n + snm1;
    }


    public static int fibonacci_Of_N(int n) {
        if( n == 0 || n == 1 ){
            return n;
        }

        int fib_nm1 = fibonacci_Of_N(n-1); 
        int fib_nm2 = fibonacci_Of_N(n-2);
        return fib_nm1 + fib_nm2;
    }


    public static boolean isArraySorted(int arr[], int i) {
        if( i == arr.length-1 ){
            return true;
        }

        // Check is sorted or not
        if( arr[i] > arr[i+1] ) {
            return false;
        }

        // Recall for next value of array
        return isArraySorted(arr, i+1);
    }
    

    public static int first_Occurrence(int ar[], int key, int i) {
        if( i == ar.length ){
            return -1;
        }

        if( ar[i] == key ) {
            return i;
        }

        return first_Occurrence(ar, key, i+1);
    }


    public static int last_Occurrence(int ar[], int key, int i) {
        if( i == ar.length ){
            return -1;
        }

        int isFound = last_Occurrence(ar, key, i+1);

        if( (isFound == -1) && (ar[i] == key) ){
            return i;
        }
        
        return isFound;
    }


    public static int X_power_N_bruteCase(int x, int n) {
        if( n == 0 ){
            return 1;
        }

        return x * X_power_N_bruteCase(x, n-1);
    }
    
    
    public static int X_power_N_optimizeCase(int x, int n) {
        if( n == 0 ){
            return 1;
        }

        int halfPower = X_power_N_bruteCase(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // Check for Odd values
        if( n % 2 != 0 ) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Increasing number [ 1 to n ]
        System.out.print("Increasing num 1 to n = ");
        increasingNum_1_to_n( 10);

        System.out.println();

        // Decreasing number [ n to 1 ]
        System.out.print("Decreasing num n to 1 = ");
        decreasingNum(10);

        System.out.println();

        // Factorial of N
        System.out.print("Factorial of 5 is = ");
        System.out.println(factorial_Of_N(5));

        
        // Sum of N natural numbers
        System.out.print("Sum of N natural number - '5' is = ");
        System.out.println(sum_Of_N(5));
        
        
        // Sum of N natural numbers
        System.out.print("Fibonacci of N number - '10' is = ");
        System.out.println(fibonacci_Of_N(10));


        // Check Array is Sorted or not
        int arr[] = {1, 2, 5, 10, 11};
        System.out.println("If return value is 'true' than array is sorted otherwise array is not sorted....");
        System.out.println(isArraySorted(arr, 0));


        // First Occurrence of an element in an array
        int ar[] = {1, 2, 5, 4, 6, 23, 9, 10, 3, 2, 3, 0};
        System.out.println("First_Occurrence found at index = " + first_Occurrence(ar, 3, 0));
        
        
        // last Occurrence of an element in an array
        System.out.println("Last_Occurrence found at index = " + last_Occurrence(ar, 3, 0));


        // Print X^n - [ Brute Case ]
        System.out.println("2 to the power 10 [ BruteCase ] = " + X_power_N_bruteCase(2, 10));
        
        
        // Print X^n - [ Optimize Case ]
        System.out.println("2 to the power 10 [ OptimizeCase ] = " + X_power_N_bruteCase(2, 10));


    }
    
}

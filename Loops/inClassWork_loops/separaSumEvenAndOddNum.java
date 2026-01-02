package CodeForDSA.Loops.inClassWork_loops;

import java.util.Scanner;

public class separaSumEvenAndOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // Question 6 => [ Write a program in Java that takes an integer n from the user and calculates separately the sum of all even numbers and the sum of all odd numbers from 1 to n.]

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int EvenSum = 0;
        int OddSum = 0;

        for(int i=1; i<=n; i++){

            if ( i % 2 == 0 ){
                EvenSum += i;
            } else {
                OddSum += i;
            } 
        }

        System.out.println("Sum of Even number : " + EvenSum);
        System.out.println("Sum of Odd number : " + OddSum);
    }
}

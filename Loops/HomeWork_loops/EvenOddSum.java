package CodeForDSA.Loops.HomeWork_loops;
import java.util.*;

public class EvenOddSum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // HomeWork Problem 1 => [ Write a program that reads a set of integers, and then prints the sum of the even and odd integers.]

        char choice;
        int EvenSum = 0;
        int OddSum = 0;

        do{
            System.out.print("Enter the numeber : ");
            int n = sc.nextInt();

            if( n % 2 == 0 ){
                EvenSum += n;
            } else {
                OddSum += n;
            }

            System.out.println("Do you want to continue? Press 'yes' for yes or 'no' for no");
            choice = sc.next().charAt(0);


        } while(choice == 'y');

        System.out.println("Sum of even numbers: " + EvenSum);
        System.out.println("Sum of odd numbers: " + OddSum);

    }
    
}

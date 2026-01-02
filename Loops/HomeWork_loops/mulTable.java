package CodeForDSA.Loops.HomeWork_loops;
import java.util.*;

public class mulTable {
        public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);    

    //HomeWork Problem 3 => [ Write a program to print the multiplication table of a number N, entered by the user.]

        System.out.print("How many times you want to print the table : ");
        int range = sc.nextInt();

        System.out.print("Enter the number for the table : ");
        int N = sc.nextInt();

        for(int i=1; i<=range; i++){

            int table = N * i;
            System.out.println(N + " x " + i + " = " + table);
        }
    }
}

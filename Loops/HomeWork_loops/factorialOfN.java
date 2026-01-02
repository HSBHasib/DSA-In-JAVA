package CodeForDSA.Loops.HomeWork_loops;

import java.util.Scanner;

public class factorialOfN {
        public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);    

    //HomeWork Problem 2 => [ Write a program to find the factorial of any number entered by the user]

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int fac = 1;

        for(int i=n; i>=1; i--){
            fac *= i;
        }
        System.out.println(fac);
    }
}

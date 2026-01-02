package CodeForDSA.Loops.inClassWork_loops;

import java.util.Scanner;

public class isPrimeOrNot {
      public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);    
        
    //Question 5 => [ Check if a number is Prime or not ]

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if( n == 2) {
            System.out.println(n + " is a Prime number");

        } else {

            for(int i=2; i<=Math.sqrt(n); i++) {
                if( n % i == 0 ){
                    isPrime = false;
                }
            }
        
            if(isPrime == true){
                System.err.println(n + " is a Prime number");
            } else {
                System.err.println(n + " is not a Prime number");
            }

        }
    }
    
}

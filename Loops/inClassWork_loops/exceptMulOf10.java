package CodeForDSA.Loops.inClassWork_loops;

import java.util.Scanner;

public class exceptMulOf10 {
    public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);    

    // Question 4 => [ Display all numbers by user except multiple of 10 ]
    
        System.out.print("How many time you want run the code : ");
        int range = sc.nextInt();
        int i = 1;
        
        do{
            System.out.print(i + ". Enter your number : ");
            int n = sc.nextInt();

            if( n % 10 == 0 ){
                continue;
            }
        
            System.out.println("You entered = " + n);
            i++;
        
        } while(i <= range);
    }
}

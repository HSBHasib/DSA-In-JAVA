package CodeForDSA.Loops.inClassWork_loops;
import java.util.*;

public class ReverseOfNum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Question 1 => [ Print Reverse of a numebr ]

    System.out.print("Enter your number : ");
    int n = sc.nextInt();

    while ( n > 0 ) {
        int LastDigit = n % 10;
        System.out.print(LastDigit);
        n /= 10;
    }
    System.err.println();
    


    // Question 2 => [ Reverse the given numebr {Orginal number} ]
    
    System.out.print("Enter your number : ");
    int num = sc.nextInt();
    
    int Reverse = 0;
    
    while ( num > 0 ) {
            int LastDigit = num % 10;
            Reverse = (Reverse*10) + LastDigit; 
            num /= 10;
        }
        System.out.print("Reverse Value is : " + Reverse);


    }
    
}

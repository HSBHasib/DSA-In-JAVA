package CodeForDSA.Recursion.Recursion2.inClassWork_Recursion2;
import java.util.*;

public class Friends_Pairing {

    public static int friends_Pairing(int n) {
        if( n == 1 || n == 2 ){
            return n;
        }

        // Choice
        // Single
        int fnm1 = friends_Pairing(n-1);

        // Pairs
        int fnm2 = friends_Pairing(n-2);
        int pairWays = (n-1) * fnm2;

        int totWays = fnm1 + pairWays;
        return totWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int totWays = friends_Pairing(n);
        System.out.println("" + totWays);

    }    
}

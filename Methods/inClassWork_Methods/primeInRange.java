package CodeForDSA.Methods.inClassWork_Methods;
import java.util.*;

public class primeInRange {

    // Check Prime_Number
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        if( n == 2 ){
            isPrime = true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            
            if( n % i == 0 ){
                isPrime = false;
            }
        }

        return isPrime;
    }



    public static void primeInRange(int n) {

        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check Prime_Number
        // System.out.print("Enter any number : ");
        // int n = sc.nextInt();

        // boolean isPrime = isPrime(n);
        // System.out.println(isPrime);



        // Print all Prime in Range
        System.out.print("Enter the range of Prime number : ");
        int n = sc.nextInt();

        primeInRange(n);

    }
    
}
